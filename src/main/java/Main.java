import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet();
        set.add("text1");
        set.add("text2");
        set.add("text");

        for (String s : set) {
            System.out.println(s);
        }
    }
}

