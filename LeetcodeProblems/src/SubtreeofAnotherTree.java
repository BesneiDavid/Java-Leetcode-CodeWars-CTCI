import java.util.LinkedList;
import java.util.Queue;

public class SubtreeofAnotherTree {
//    Time complexity: O(n) we're going through each node only once.
//    Space complexity: O(h) where h is the depth of the tree.
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (root.val == subRoot.val && isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode subRoot = new TreeNode(0);
        System.out.println(isSubtree(root,subRoot));
    }
}
