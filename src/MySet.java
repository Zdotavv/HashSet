import java.util.Iterator;

public interface MySet {
    interface Entry {
        String getKey();
    }
    boolean myadd(String e) throws Exception; // Returns true if this set did not already contain the specified element

    void clear();

    boolean contains(String e);

    boolean isEmpty();

    boolean remove(String e); // Returns true if this set contained the specified element

    int size();

    String[] toArray();

    String toString();

}
