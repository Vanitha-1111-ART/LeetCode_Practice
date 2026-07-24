class Solution {
    public int numUniqueEmails(String[] emails) {
        String local="";
        String domain="";
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String s=emails[i];
            int k=s.indexOf('@');
            int l=s.indexOf('+');
            domain=s.substring(k);
            local=s.substring(0,k);           
            if(l!=-1){
                 local=s.substring(0,l);
            }
            local=local.replace(".","");
            set.add(local+domain);

        }
        return set.size();    
    }
}