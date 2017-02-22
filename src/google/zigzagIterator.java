package google;
import java.util.*;
import java.util.Iterator;

/**
 * Created by hongruzh on 2/12/17.
 */
public class zigzagIterator {
    LinkedList<Iterator> list;

    public zigzagIterator(List<Integer> v1,List<Integer> v2){
        list = new LinkedList<Iterator>();
        if(!v1.isEmpty()) list.add(v1.iterator());
        if(!v2.isEmpty()) list.add(v2.iterator());
    }
    public int next() {
        Iterator poll = list.remove();
        int result = (Integer)poll.next();
        if(poll.hasNext())
            list.add(poll);
        return result;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}
