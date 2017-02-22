package google;

/**
 * Created by hongruzh on 1/27/17.
 */
public class googleRoundupAverage{

    public int solution(int X){
        int max = Integer.MIN_VALUE;
        StringBuilder builder = new StringBuilder(String.valueOf(X));

        for(int i=1;i<builder.length();i++){
                int number1 = Integer.parseInt(builder.charAt(i-1)+"");
                int number2 = Integer.parseInt(builder.charAt(i)+"");
                int result = (number1+number2+1)/2;
                System.out.println((char)(result+'0'));
                //System.out.println(result);
                StringBuilder b = new StringBuilder(builder.toString());
                b.setCharAt(i,(char)(result+'0'));
                //abc
                b.deleteCharAt(i - 1);


                int a = Integer.valueOf(b.toString());
                if(a>max) {
                    max = a;
                }
        }
        return max;
    }
}
