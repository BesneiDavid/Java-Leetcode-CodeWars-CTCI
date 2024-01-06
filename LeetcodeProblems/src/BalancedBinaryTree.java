public class BalancedBinaryTree {

//    Time complexity O(n) we're traversing each node one time
//    Space complexity O(1) we have a global variable for the difference
    static int difference;

    public static TreeNode buildTree(Integer[] array, int index) {
        TreeNode root = null;

        if (index < array.length && array[index] != null) {
            root = new TreeNode(array[index]);
            root.left = buildTree(array, 2 * index + 1);
            root.right = buildTree(array, 2 * index + 2);
        }

        return root;
    }

    public static  boolean isBalanced(TreeNode root) {
        difference = 0;
        dfs(root);

        return !(difference > 1);
    }

    public static int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = 1 +dfs(root.left);
        int right = 1+dfs(root.right);
        int diff = Math.abs(left-right);

        if(diff > difference){
            difference=diff;
        }

        return Math.max(left,right);
    }

//  Chat gpt solution which doesn't require a global variable
    public static boolean isBalanced2(TreeNode root) {
        return dfs(root) != -1;
    }

    public static int dfs2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }


    public static void main(String[] args) {
        Integer[] array = {};
        TreeNode root = buildTree(array, 0);

        System.out.println(isBalanced(root));
    }
}
