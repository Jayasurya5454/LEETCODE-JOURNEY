class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        List<Integer> ans =new ArrayList<>();
        if(root==null)return new ArrayList<>();
        q.add(root);
        while(q.size()!=0)
        {   List<Integer> temp =new ArrayList<>();
            int count=q.size();
            while(count!=0)
            {   TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                count--;
            }
            ans.add(temp.get(temp.size()-1));

        }
        return ans;
    }
}