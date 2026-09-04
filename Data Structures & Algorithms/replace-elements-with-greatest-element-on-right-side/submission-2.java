class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        if(n==1){
             result[0]=-1;
             return result;
        }
        result[n - 1] = -1;
        result[n - 2] = arr[n - 1];
        for (int i = 0; i < n - 2; i++) {
            int maxElement = arr[i + 1];
            for (int j = i + 2; j < n; j++) {
                maxElement = Math.max(maxElement, arr[j]);
            }
            result[i] = maxElement;
        }
        return result;
    }
}