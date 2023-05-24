package qa;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "teetery";
        for(char i : str.toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println(i);
            }
        }
    }
}
