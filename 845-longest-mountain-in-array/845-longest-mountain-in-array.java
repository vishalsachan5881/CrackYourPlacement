class Solution {
    public int right(int[] arr, int start){
        int prev = arr[start],c = 0;
        for(int i = start+1; i<arr.length;i++)
            if(arr[i]<prev){
                prev = arr[i];
                c++;
            }
        else return c;
        return c;
    }
    public int left(int[] arr, int start){
        int prev = arr[start],c = 0;
        for(int i = start-1; i>=0;i--)
            if(arr[i]<prev){
                prev = arr[i];
                c++;
            }
        else return c;
        return c;
    }
    public int longestMountain(int[] arr) {
        int n  = arr.length;
        boolean[] temp = new boolean[n];
        
        for(int i =1; i<n-1;i++){
                if(arr[i] > arr[i-1] && arr[i]>arr[i+1])
                    temp[i] = true;
        }
       // System.out.println(Arrays.toString(temp));
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(temp[i])
               ans = Math.max(ans, right(arr,i)+left(arr,i)+1);
               
        }
               return ans;
    }
}