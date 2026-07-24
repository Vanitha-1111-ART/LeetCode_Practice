class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int k = 0;

        for (int i = 0; i < ans.length; i++) {
            if (k < ans.length) {
                if (arr[i] == 0) {
                    ans[k] = arr[i];
                    if (k + 1 < ans.length) {
                        ans[k + 1] = 0;
                        k++;
                    }
                } else {
                    ans[k] = arr[i];
                }
                k++;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}