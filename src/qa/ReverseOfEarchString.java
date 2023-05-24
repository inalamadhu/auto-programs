package qa;

public class ReverseOfEarchString {
    public static void main(String[] args) {
        String str = "This is new text work";
        //o/p: sihT si wen txet krow
        String[] strs = str.split(" ");
        for(String s : strs){
            for(int j=s.length()-1; j>=0; j--){
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
