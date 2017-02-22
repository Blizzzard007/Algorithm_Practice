//package google;
//import java.util.*;
///**
// * Created by hongruzh on 2/6/17.
// */
//public class expressionAddoperators {
//
//    List<String> res;
//
//    public List<String> addOperators(String num,int target){
//        helper(num, target, "", 0, 0);
//    }
//
//    public void helper(String num,int target,String tmp,long currRes,long prevNum){
//        //如果计算结果等于目标值，而且所有的数都用完了,则是有效结果
//        if(currRes == target && num.length()==0){
//            String exp = new String(tmp);
//            res.add(exp);
//            return;
//        }
//        //搜索所有可能的拆分情况
//        for(int i=1;i<num.length();i++){
//            String currStr = num.substring(0, i);
//            if(currStr.length()>1&&currStr.charAt(0)=='0'){
//                return;
//            }
//            //得到当前截出来的数
//            long currNum = Long.parseLong(currStr);
//            //去掉当前截取的数，得到下一轮搜索用到的字符串
//            String next = num.substring(i);
//            //如果不是第一个字母，可以加运算符,否则只能加数字
//
//            if(tmp.length()!=0){
//
//                helper(next,target,tmp+'*'+currNum);
//            }
//        }
//        //得到当前戒出的数
//
//
//    }
//}
