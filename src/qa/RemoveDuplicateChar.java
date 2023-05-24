package qa;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        /*String str = "this is selenium test";
        String res="";
        for(int i=0; i<str.length(); i++) {
            int c = 0;
            if (!Character.isWhitespace(str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        ++c;
                    }
                }
            }else{
                res = res + " ";
            }
            if(c == 1){
                res += str.charAt(i);
            }

        }
        System.out.println(res);*/
        RemoveDup();
    }

    public static void RemoveDup(){
        String str = "this is selenium test";
        String res="";
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!Character.isWhitespace(ch)) {
                if (set.add(ch)) {
                    res += ch;
                }
            }else{
                res +=" ";
            }
        }
        System.out.println(res);
    }
}
