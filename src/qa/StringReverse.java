package qa;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Selenium";
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        System.out.println(res);

    }
}
