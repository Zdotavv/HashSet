import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class myHashSet implements MySet {

    private HashMap<String, Object> map = new HashMap<>();
    private static final Object PRESENT = new Object();
//    int size=0;

    @Override
    public boolean myadd(String e) throws Exception {
        if (e == null) {
            throw new Exception("Error of null");
        }
//    size++;
        return map.put(e, PRESENT) == null;
    }

    @Override
    public void clear() {
//        size=0;
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
//        return size() == 0;
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
    public String[] toArray() {
//        return (String[]) map.keysToArray(new Object[map.size()]);
//
//    }
//String[] result=new String[map.size()];
//int index =0;
//
//        String[] HashMap=new HashMap;
//        for (String tmp:HashMap) {
//    while (tmp !=null) {
//        result[index]=tmp;
//        tmp=tmp.next;
//        index++;
//    }
//    return result;
//}
            return new String[0];

    }


        @Override
        public String toString() {
            return "myHashSet"+map.keySet();
        }
//
//        String[] result = new String[map.size()];
//        MyMap.Node[] nodes = map.toArray();
//        for (int i = 0; i < result.length;i++){
//            result[i] = nodes[i].getKey();
//        }
//        return result;


}

//}

