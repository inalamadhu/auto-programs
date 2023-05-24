package qa;

public class Palindrome {
    public static void main(String[] args) {
        int n = 625456;
        int temp = n;
        int res = 0;
        while(n != 0){
            res = (res*10)+(n%10);
            n = n/10;
        }
        if(res == temp){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
