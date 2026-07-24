class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j = tokens.length - 1;
        int s = 0;
        int maxs=0;
        while (i <=j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                s++;
                i++;
                maxs=Math.max(maxs,s);
            } else if(s>0) {
                if (power < tokens[j]) {
                    power += tokens[j];
                    s--;
                    j--;
                }
            }
            else{
                break;
            }

        }
        return maxs;

    }
}