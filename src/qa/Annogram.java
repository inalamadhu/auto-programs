package qa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Annogram {

    public static void main(String[] args) {
        String str1 = "keep";
        String str2 = "peek";
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int n = str1.length()+str2.length();
        for(int i=0; i<n; i++){
            if(i<str1.length()){
                map.put(str1.charAt(i), (map.containsKey(str1.charAt(i)))?map.get(str1.charAt(i))+1:1);
            }else{
                map.put(str2.charAt(j), (map.containsKey(str2.charAt(j)))?map.get(str2.charAt(j))-1:1);
                ++j;
            }
        }

        for(Character ch : new ArrayList<>(map.keySet())){
            if(map.get(ch) !=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
