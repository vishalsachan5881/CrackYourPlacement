//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        List<Integer> ans= new ArrayList<>();
        int index = n-1, k = n-1;
        for(int i = n-2 ; i>= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        // System.out.println(index);
        
        for(int i = n-1; i>index;i--){
            if(arr[i] > arr[index]) {
                k = i;
                break;
            }
        }
        // System.out.println(index);
        
        if(index == n-1){
            Arrays.sort(arr);
        }else{
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
            
            Arrays.sort(arr,index+1,n);
        }
        
        for(var v : arr) ans.add(v);
        return ans;
        
    }
}