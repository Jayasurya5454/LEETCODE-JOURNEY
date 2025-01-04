class Solution {
    public int minDepth(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return 0;
        q.add(root);
        int level=0;
        while(q.size()!=0)
        {
            int count = q.size();
            while(count!=0)
            {
                TreeNode curr = q.poll();
                if(curr.left==null && curr.right ==null) return level+1;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);            
                count--;
            }
           level++;
        }
        return 0;
        
    }
}