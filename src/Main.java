import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        MySet<String> set = new myHashSet();
        System.out.println("Add Vova: "+set.myadd("Vova")+". "+"HashCode: "+"Vova".hashCode());
        System.out.println("Size after adding Vova: "+set.size());
        System.out.println("Add Jenya: "+set.myadd("Jenya")+". "+"HashCode: "+"Jenya".hashCode());
        System.out.println("Size after adding Jenya : "+set.size());
        set.myadd("Sasha");
        System.out.println("Size after adding Sasha : "+set.size()+". "+"HashCode of Sasha: "+"Sasha".hashCode());

        set.myadd("Petya");
        System.out.println("Size fter adding Petya: "+set.size()+". "+"HashCode of Petya: "+"Petya".hashCode());

        System.out.println("Add Vova: "+set.myadd("Vova"));
        System.out.println("Size: "+set.size());

        System.out.println("Contains Jenya: "+set.contains("Jenya"));
        System.out.println("Remove Jenya : "+set.remove("Jenya"));
        System.out.println("Size: "+set.size());
        System.out.println("Contains Jenya: "+set.contains("Jenya"));
        System.out.println("Contains Vova: "+set.contains("Vova"));
        System.out.println("Remove Vova : "+set.remove("Vova"));
        System.out.println("Contains Vova: "+set.contains("Vova"));
        System.out.println("Size: "+set.size());
        System.out.println("HashCode of set: "+set.hashCode());
        System.out.println("Method toArray: "+Arrays.toString(set.toArray()));
        System.out.println("Method toString: "+set.toString());
        set.clear();
        System.out.println("Size after method clear: "+set.size());
        System.out.println("Is Empty: "+set.isEmpty());

    }

}
