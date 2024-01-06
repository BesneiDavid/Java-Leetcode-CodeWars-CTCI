

public class MaximumDepthOfBinaryTree {
    public static  int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(10);
        System.out.println(maxDepth(root));
    }
}
