//package google;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
///**
// * Created by hongruzh on 2/10/17.
// */
//public class shortDistance {
//    public int shortestDistance(int[][] grid){
//
//        if(grid==null||grid[0].length==0) return 0;
//
//        int[] shift = new int[]{0,1,0,-1,0};
//
//        int row = grid.length;
//        int col = grid[0].length;
//        int[][] distance = new int[row][col];
//        int[][] reach = new int[row][col];
//        int buildingNum = 0;
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(grid[i][j]==1){
//                    buildingNum++;
//                    Queue<int[]> myQueue = new LinkedList<int[]>();
//                    myQueue.offer(new int[]{i,j});
//
//                    boolean[][] isVisited = new boolean[row][col];
//                }
//            }
//        }
//    }
//}
