 
class Solution {
    public List<Integer> lt = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        iot(root);
        return lt;
        
    }
    void iot(TreeNode root)
    {
        if(root==null)return;
        iot(root.left);
        lt.add(root.val);
        iot(root.right);

    }
}