package google;

/**
 * Created by hongruzh on 1/24/17.
 */
public class google1 {

    public int solution(int X){
        int max = Integer.MIN_VALUE;
        StringBuilder builder = new StringBuilder(String.valueOf(X));

        for(int i=1;i<builder.length();i++){
            if(builder.charAt(i-1)==builder.charAt(i)){
                StringBuilder b = new StringBuilder(builder.toString());
                b.deleteCharAt(i);
                int a = Integer.valueOf(b.toString());
                if(a>max){
                    max = a;
                }
            }
        }
        return max;
    }

    public int minSolution(int X){
        int min = Integer.MAX_VALUE;
        StringBuilder builder = new StringBuilder(String.valueOf(X));

        for(int i=1;i<builder.length();i++){
//            if(builder.charAt(i-1)<builder.charAt(i)){
                StringBuilder b = new StringBuilder(builder.toString());
                b.deleteCharAt(builder.charAt(i-1)>builder.charAt(i)?i:i-1);
                int a = Integer.valueOf(b.toString());
                if(a<min){
                    min = a;
                }
            //}
        }
        return min;
    }

//    public int minSolution(){
//
//    }
}
