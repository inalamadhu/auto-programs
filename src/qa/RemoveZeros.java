package qa;

public class RemoveZeros {
    public static void main(String[] args) {

        int n = 1054056207;
        System.out.println(n%10);
        System.out.println(n/10);

        int res=0;
        int i = 0;
        while(n>0){
            int d = n%10;
            if(d != 0){
                res += d* Math.pow(10, i);
                ++i;
            }
            n = n/10;
        }
        System.out.println(res);
    }
}
