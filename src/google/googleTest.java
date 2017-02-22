package google;

import java.util.Stack;

/**
 * Created by hongruzh on 1/25/17.
 */
public class googleTest {

    public int getLength(String s){

        String[] strArr = s.split("\n");
        int result = 0;
        int curLen = 0;

        Stack<Integer> stack = new Stack<>();
        for(String file:strArr){
            int level = countLevel(file);

            while(stack.size()>level){
                curLen -= stack.pop();
            }
            int len = file.replaceAll(" ","").length()+1;
            curLen += len;
            if (file.contains("jpeg") || file.contains("png") || file.contains("gif")){
                result = Math.max(result, curLen-1);
            }
            stack.add(len);
        }
        return result;
    }

    public int countLevel(String file){
        String cur = file.replaceAll(" ","");
        return file.length()-cur.length();
    }



    public int countLevel1(String file){
        String cur = file.replaceAll(" ","");
        return file.length()-cur.length();

    }
}
