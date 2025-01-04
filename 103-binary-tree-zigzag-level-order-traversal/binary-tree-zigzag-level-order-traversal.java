class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return new ArrayList<>();
        q.add(root);
        boolean flag = true;
        while(q.size()!=0)
        {
            int count = q.size();
            List<Integer> ans = new ArrayList<>();

            while(count!=0)
            {
                TreeNode curr = q.poll();
                if(flag)
                ans.add(curr.val);
                else 
                ans.addFirst(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);            
                count--;
            }
            
            lst.add(ans);
           flag =!flag;
        }
        return lst;
        
    }
}