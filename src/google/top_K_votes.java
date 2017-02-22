package google;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by hongruzh on 2/9/17.
 */
public class top_K_votes {

    HashMap<Long,HashMap<String,Integer>> votes = new HashMap<>();

    public void insert(String name,long timestamp){

        if(votes.containsKey(timestamp)) {
            HashMap<String, Integer> tmp = votes.get(timestamp);
            tmp.put(name, tmp.get(name) + 1);
            votes.put(timestamp, tmp);
        }
        else{
            HashMap<String,Integer> tmp = new HashMap<>();
            tmp.put(name, 1);
            votes.put(timestamp,tmp);
        }
    }

    public List<String> topK(int k,long timestamp){
        long time = 0;
        HashMap<String,Integer> globalCount = new HashMap<>();

        for(Map.Entry<Long,HashMap<String,Integer>> entry:votes.entrySet()){

            if(entry.getKey()<=timestamp){

                HashMap<String,Integer> tmp = entry.getValue();

                for(Map.Entry<String,Integer> e:tmp.entrySet()){
                    if(globalCount.containsKey(e.getKey())){
                        globalCount.put(e.getKey(),globalCount.get(e.getKey())+1);
                    }else{
                        globalCount.put(e.getKey(),1);
                    }
                }
            }
        }
        List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(globalCount.entrySet());

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                   return o1.getValue().compareTo(o2.getValue());
            }
        });

        List<String> res = new ArrayList<>();
        int i = 0;
        for(Entry<String,Integer> s:globalCount.entrySet()){
            if(i==k){
                break;
            }
            res.add(s.getKey());
            i++;
        }
        return res;
    }

}
