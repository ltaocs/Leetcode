package lt;

/**
 * Created by Lin Tao on 6/5/2017.
 */


public class L606 {
    public static String tree2str(TreeNode t) {
        String str = null;
        if (t == null) {
            return null;
        } else {


            if (t.left == null) {
                str = str + "()";

            } else {
                tree2str(t.left);
                str = str + "(" + t.left.val + ")";
            }

            if (t.right != null) {
                tree2str(t.right);
                str = str + "(" + t.right.val + ")";
            }


        }


        return str;
    }
/*
    public static String tree2str(TreeNode t) {
        if (t == null) return "";

        String result = t.val + "";

        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if (right == "") return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }*/

}
