
class Solution {
    public int maxDepth(TreeNode root) {
        {
            if(root == null)return 0;
            int lp = maxDepth(root.left);
            int rp = maxDepth(root.right);
            return 1+ Math.max(lp,rp);


        }
        
    }
}