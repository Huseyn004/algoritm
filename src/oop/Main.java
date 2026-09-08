package oop;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String x = "running";
        Map<Character, Integer> a = new HashMap<>();
        for (char c : x.toCharArray()) // ['r', 'u', 'n', 'n', 'i', 'n', 'g']
        {
            if (!a.containsKey(c)) {
                a.put(c, 0);
            } else {
                Integer i = a.get(c);
                a.put(c, i+1);
            }
//            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        System.out.print("Təkrarlanan hərflər: ");

        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : a.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "");
            }
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }
        }

        String result = x.replace("n", "");
        System.out.println("Final word: " + result);




        StringBuilder y = new StringBuilder("alphabet");
        y.append("abc");
        System.out.println("Əlavə edildi: " + y);
    }
}
