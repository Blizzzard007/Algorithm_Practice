package google;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hongruzh on 2/18/17.
 */
public class employeeDepth {

    int max = Integer.MIN_VALUE;

    /**
     * 在树的层次较深&&子节点个数较多的情况下，消耗内存现象十分严重。因此，
     * BFS适用于节点的子节点个数不多，并且树的层次不会太深的情况。优点：可以得到最优解。
     *
     * DFS: if you dont have recursive export, you will be
     * @param root
     * @param depth
     * @return
     */
    public int employeeDepth(TreeNode root,int depth){

        if(root.children==null){
            return 1;
        }

        if(root.children!=null){
            for(TreeNode node:root.children){
                employeeDepth(node,depth+1);
            }
        }

        max = Math.max(depth,max);

        return max+1;

    }

    public int employbfs(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        int depth = 0;
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for(int i=0;i<size;i++){
                TreeNode q = queue.poll();
                for(TreeNode node:q.children){
                    queue.offer(node);
                }
            }

        }
        return depth;
    }
}
