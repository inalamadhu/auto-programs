package qa;

public class ArmstrongNumber {


    public static void main(String[] args) {
        int num = 1634;
        int p = 0;
        int temp = num;
        while(num != 0){
            num = num/10;
            ++p;
        }

        num = temp;
        int res = 0;
        while(num != 0){
            int d = num%10;
           res += Math.pow(d, p);
           num = num/10;
        }
        if(temp == res){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
