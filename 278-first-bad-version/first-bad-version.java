/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // public int firstBadVersion(int n) {
        
    //     for(int i=1;i<=n;i++)
    //     {
    //         if(isBadVersion(i))
    //         {
    //             return i;
    //         }
    //     }
    //     return 0;
    // }

    public int firstBadVersion(int n) {
        int  l=0,r=n,mid=0,fin=0;
        if(n==1)
        return n;
        while(l<=r)
        {
             mid = l+(r-l)/2;
            if(isBadVersion(mid))
            {   fin=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return fin;




        
    }

    
}