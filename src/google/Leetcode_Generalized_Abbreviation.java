package google;
import java.util.*;
/**
 * Created by hongruzh on 2/4/17.
 */
public class Leetcode_Generalized_Abbreviation {

    public List<String> generateAbbreviation(String word){
        List<String> res = new ArrayList<String>();
        dfs(0,word.toCharArray(),new StringBuffer(),0,res);
        return res;
    }

    public void dfs(int pos,char[] word,StringBuffer sb,int count,List<String> res){
        int len = word.length;
        int sbOriginSize = sb.length();

        if(pos==len){
            if(count>0) sb.append(count);

            res.add(sb.toString());
        }

        else{

            dfs(pos+1,word,sb,count+1,res);

            if(count>0) sb.append(count);
            dfs(pos+1,word,sb,0,res);
        }
        sb.setLength(sbOriginSize);


    }
}
