import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class myHashSet implements MySet<String>  {

    private HashMap<String, Object> map = new HashMap<>();
    private static final Object PRESENT = new Object();

    @Override
    public boolean myadd(String e) throws Exception {
        if (e == null) {
            throw new Exception("Error of null");
        }
        return map.put(e, PRESENT) == null;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(String e) {
        return map.containsKey(e);
    }


    @Override
    public boolean isEmpty() {
        if (map.size() == 0) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean remove(String e) {
        return map.remove(e) == PRESENT;

    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public  String[] toArray() {
        return map.keySet().toArray(new String[0]);
    }

        @Override
        public String toString() {
        return "myHashSet"+map.keySet();
        }
}


