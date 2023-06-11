package qa;

import java.util.Arrays;

public class ReverseSequenceWithoutSpaces {

    public static void main(String[] args) {
        String str = "I am a java guy";
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i < j){
            if(Character.isWhitespace(ch[i])){
                ++i;
            }else if(Character.isWhitespace(ch[j])){
                --j;
            }else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                ++i;
                --j;
            }
        }
        System.out.println(Arrays.toString(ch));

    }


}
