//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Student{
    int physics, chem, maths;
    Student(int physics, int chem, int maths){
        this.physics = physics;
        this.chem = chem;
        this.maths = maths;
    }
}
class Solution
{
    public void customSort (int phy[], int chem[], int math[], int n)
    {
        // your code here
        Student[] arr = new Student[n];
        for(int i = 0 ; i  <n ; i++){
            arr[i] = new Student(phy[i], chem[i], math[i]);
        }
        Arrays.sort(arr, (a,b)->{
           if(a.physics != b.physics) return a.physics - b.physics;
           else if(a.chem != b.chem) return b.chem - a.chem;
           else return a.maths - b.maths;
        });
        
        for(int i = 0 ; i < n ; i++){
            phy[i] = arr[i].physics;
            chem[i] = arr[i].chem;
            math[i] = arr[i].maths;
        }
        return ;
    }
}
