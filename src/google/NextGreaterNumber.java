package google;
import java.util.*;

/**
 * Created by hongruzh on 2/9/17.
 */
public class NextGreaterNumber {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        int[] result = new int[findNums.length];
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<findNums.length;i++){
            for(int j=map.get(findNums[i]);j<nums.length;j++){
                if(nums[j]>findNums[i]){
                    result[i] = nums[j];
                }
                else{
                    result[i] = -1;
                }
            }
        }

        return result;
    }
}
