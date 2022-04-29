/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = makeArray(root, new ArrayList<Integer>());
        return arr.get(k-1);
    }
    
    public ArrayList<Integer> makeArray(TreeNode node, ArrayList<Integer> arr){
        if(node == null) 
            return arr;
        
        makeArray(node.left, arr);
        arr.add(node.val);
        makeArray(node.right, arr);
        
        return arr;
    }
}