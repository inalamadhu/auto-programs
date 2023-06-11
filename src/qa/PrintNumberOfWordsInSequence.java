package qa;

import java.util.HashMap;
import java.util.Map;

public class PrintNumberOfWordsInSequence {
    public static void main(String[] args) {
        String str = "learn java learn java program java learn java test";
        Map<String, Integer> map = new HashMap<>();
        for(String s : str.split(" ")){
            map.put(s, (map.containsKey(s)?map.get(s)+1:1));
        }
        System.out.println(map);

    }

}
