/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, h = n;
        while(l<=h){
            int m = l + (h-l)/2;
            boolean temp = isBadVersion(m);
            
            if(!temp) l = m+1;
            else h = m-1;
        }
        return l;
    }
}