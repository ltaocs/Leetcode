package lt;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Lin Tao on 6/5/2017.
 */
public class L606Test {
    @Before
    public void setUp() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void tree2str() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        assertEquals("1(2(4))(3)", L606.tree2str(node1));
        assertEquals("a", "a");
    }

}