package lt;

/**
 * Created by Lin Tao on 6/10/2017.
 */

/*Last executed input:[1,3,2,5]
    [2,1,3,null,4,null,7]*/

public class L617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = t1;



            while (t1 != null || t2 != null) {

                if (t1 != null && t2 != null) {

                    t3.val = t1.val + t2.val;
                    mergeTrees(t1.left,t2.left);
                    mergeTrees(t1.right,t2.right);
                } else if (t1 == null && t2 == null) {
                    t3 = null;
                    mergeTrees(t1.left,t2.left);
                    mergeTrees(t1.right,t2.right);
                } else if (t1 == null) {
                    t3.val = t2.val;
                    mergeTrees(t1.left,t2.left);
                    mergeTrees(t1.right,t2.right);
                } else {
                    t3.val=t1.val;
                    mergeTrees(t1.left,t2.left);
                    mergeTrees(t1.right,t2.right);
                }


        }


        return t3;

    }
}
