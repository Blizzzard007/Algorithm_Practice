package google;

/**
 * Created by hongruzh on 1/29/17.
 */
public class magicString {
    public int magicalString(int n) {

        StringBuilder magic = new StringBuilder("122");
        int pt1 = 2, pt2 = magic.length(), count = 0; //initiate pointers
        //generate sequence directly
        while(magic.length() < n){
            if(magic.charAt(pt1) == '1'){
                if(magic.charAt(pt2-1) == '1') magic.append(2);
                else magic.append(1);
                pt2++;
            }else{ //==2
                if(magic.charAt(pt2-1) == '1'){
                    System.out.println(magic);
                    magic.append(22);
                    System.out.println(magic);
                }

                else{
                    magic.append(11);
                }
                pt2+=2;
            }
            pt1++;
        }
        for(int i=0;i<n;i++)
            if(magic.charAt(i)=='1') count++;
        return count;
    }
}
