import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(15,"15");
        map.put(16,"16");
        map.put(19,"19");
        map.put(16,"16-2");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
    public static void collections() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "text1");
        map.put(2, "text1");
        map.put(3, "text1");
        map.put(null, "text1");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer,String> entry = entryIterator.next();
            System.out.println(entry);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        Iterator<Integer> integerIterator = arrayList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}

