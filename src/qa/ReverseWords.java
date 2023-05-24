package qa;

public class ReverseWords {

    //o/p: Test Selenium Is This
    public static void main(String[] args) {
        String str = "This is Selenium Test";
        String[] strs = str.split(" ");
        String res = "";
        for(int i=0; i<strs.length; i++){
            res = strs[i] + " "+ res;
        }
        System.out.println(res.trim());


        /*   String str = "This is Selenium Test";
        String[] strs = str.split(" ");
        String res = "";
        for(int i=strs.length-1; i>=0; i--){
            System.out.print(strs[i]);
            System.out.print(" ");
        }*/


    }
}
