

public class Leetcode1379 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        /**
         * If we've reached the end of tree or tree itself is null return null
         */
        if (original == null)
            return null;

        /**
         * If reference of target node passed matches refernce of current node in original tree, return node of cloned tree
         */
        if (original == target)
            return cloned;

        /**
         * Check left subtree recursively first
         */
        TreeNode left = getTargetCopy(original.left, cloned.left, target);

        /**
         * If node is found in left subtree return the same, if not found only then traverse right subtree recursively
         */
        return left != null ? left : getTargetCopy(original.right, cloned.right, target);

    }

}
