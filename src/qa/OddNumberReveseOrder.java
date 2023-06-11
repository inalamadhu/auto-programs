package qa;

public class OddNumberReveseOrder {

    public static void main(String[] args) {
        int n = 100;

        int c = 0;
        for(int i=n; i>0; i--){
            if(i%2 != 0){
                if(c==0){
                    System.out.println(i);
                    c = 1;
                }else{
                    c=0;
                }
            }

        }


    }


}
