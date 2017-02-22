import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by hongruzh on 1/25/17.
 */
public class TwoSigma {

    public int longestChain(String[] words){
        Set<String> set = new HashSet<>();
        //HashMap to store the longest chain starting from visited words
        //so that we do not need to calculate again if we meet it again
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(String word:words){
            set.add(word);
        }
        //global value of longest chain
        int longest = 0;
        //go through words and calculate the longest length length of chain starting from each word

        for(String word:words){
            if(word.length()>longest){
                int length = dfs(word,set,map)+1;
                longest = Math.max(length,longest);
            }
        }
        return longest;

    }

    public int dfs(String word,Set<String> set,Map<String,Integer> map){
        int result = 0;

        for(int i=0;i<word.length();i++){
            //generate candidates for next word String
            String nextWord = word.substring(0,i)+word.substring(i+1);

            //if candidate word does not exsit it,skip it;
            if(!set.contains(nextWord)){
                continue;
            }

            if(map.containsKey(nextWord)){
                result = Math.max(result,map.get(nextWord));
            }else{
                result = Math.max(result,dfs(nextWord,set,map)+1);
            }
        }
        map.put(word,result+1);
        return result;
    }


    public int friendCricle(String[] friends){

        if(friends==null||friends.length==0)
            return 0;
        int count = 0;

        boolean[] visited = new boolean[friends.length];

        for(int i=0;i<friends.length;i++){
            if(!visited[i]){
                count++;//if current person has not been visited before
                //then this is a new friends circle,mark current
                visited[i] = true;
                dfs(friends,visited,i);
            }
        }
        return count;
    }

    public void dfs(String[] friends,boolean[] visited,int pos){
        for(int i=0;i<friends.length;i++){
            if (!visited[i] && pos != i && friends[pos].charAt(i) == 'Y') {
                visited[i] = true;
                dfs(friends, visited, i);
            }
        }
    }
}
