package qa;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 27;

        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println(n1+" "+n2);

    }

}
