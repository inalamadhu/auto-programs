package qa;

public class SwapTwoStringsWithoutThrirdVariable {

    public static void main(String[] args) {
        String str1 = "Thisre";
        String str2 = "Textnbbnb";

        str1 = str1 + " "+str2;
        str2 = str1.substring(0, (str1.length()-str2.length())-1);
        str1 = str1.substring(str2.length()+1, str1.length());
        System.out.println(str1+ " "+ str2);

    }

}
