package qa;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abbgbba";
        int j = str.length()-1;
        int i = 0;
        while(i<j){
            if(str.charAt(i++) == str.charAt(j--)){
              /*  ++i;
                --j;*/
            }else{
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

    }
}
