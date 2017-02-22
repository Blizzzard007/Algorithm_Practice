package google;

import java.util.ArrayList;

/**
 * Created by hongruzh on 2/18/17.
 */
public class TreeNode {

    public ArrayList<TreeNode> children;
    int x;
    public TreeNode(int x){
        this.x = x;
        children = new ArrayList<>();
    }
}
