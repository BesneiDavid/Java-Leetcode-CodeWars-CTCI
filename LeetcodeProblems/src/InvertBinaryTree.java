public class InvertBinaryTree {
    
     static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
     }

//     Time complexity: O(N) we're visiting each node exactly one time
//    Space complexity: O(n) we're using a single TreeNode, but we're creating him for each node.
    public static TreeNode invertTree(TreeNode root) {
         if(root == null){
             return null;
         }

         invertTree(root.left);
         invertTree(root.right);

         TreeNode left = root.right;
         root.right=root.left;
         root.left=left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        invertTree(root);
    }
}
