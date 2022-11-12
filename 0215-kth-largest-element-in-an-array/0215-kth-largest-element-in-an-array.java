class Solution {
    public static int select(int[] arr, int k,int low, int high){


        if(low <= high){
            int ind = partition(arr, low, high);

            if (k > ind) return select(arr, k, ind + 1, high);
            else if (k < ind) return select(arr, k, low, ind - 1);
            return arr[ind];
        }
        return -1;



    }
    public static int partition(int[] arr, int low, int high){
        int ind = low;
        int pivot = arr[high];
        for(int i = ind ; i<high ;i++){
            if(arr[i] <= pivot){
                int t = arr[ind];
                arr[ind] = arr[i];
                arr[i] = t;
                ind++;
            }

        }
        int t = arr[ind];
        arr[ind] = arr[high];
        arr[high] = t;

        //System.out.println(arr.toString());
        return ind;
    }
    
    
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        k = n-k;
        
        return select(nums,k, 0, n-1);
    }
} 