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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0) return null;
        return toBST(0,nums.length-1,nums);
    }
    public TreeNode toBST(int s, int e, int[] num)
    {
        if(s==e){
            TreeNode tmp = new TreeNode(num[s]);
            return tmp;
        }
        else if(s<e){
            int n = e-s+1, half = s+n/2;
            TreeNode root = new TreeNode(num[half]);
            root.left = toBST(s, half-1,num);
            root.right = toBST(half+1, e,num);
            return root;
        }
        else 
            return null;
    }
}