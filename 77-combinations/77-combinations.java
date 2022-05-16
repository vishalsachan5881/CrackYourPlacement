class Solution {
   public static void combination(int index, int n,int k,List<String> ans,String ansf,int count,List<List<Integer>> ans1){
        if(count == k){
            // System.out.println(ansf);
            List<Integer> l = new ArrayList<>();
            String[] splitArray = ansf.split(" ");
        // int[] array = new int[splitArray.length];
        for(int i=0;i<splitArray.length;i++)
        {
                try {
                    l.add(Integer.parseInt(splitArray[i]));
                } catch (NumberFormatException e) {
            continue;
                }
        }
            ans1.add(l);
             return;
        }
        if(index > n)
            return;


        combination(index+1, n, k , ans,ansf+" "+index,count+1,ans1);
        combination(index+1, n, k, ans,ansf,count,ans1);


    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans1 = new ArrayList<>();
        List<String> ans  = new ArrayList<>();
         combination(1,n, k, ans,"",0,ans1);
        return ans1;
}}