package lt;

/**
 * Created by Lin Tao on 6/5/2017.
 */
public class L104 {
    public static int maxDepth(TreeNode root) {



        if (root == null) {
            return 0;
        } else {

           return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));


        }

    }
}
