package qa;

public class PrintCharactersInNumber {

    public static void main(String[] args) {
        Object[] arr = {'a', 3,'b',7,'c',2,'d',6};
        for(int i=0; i< arr.length-1;i++){{
            int n = (Integer) arr[i+1];
            for(int k=0; k<n; k++){
                System.out.print((Character)arr[i]);
            }
            ++i;
            System.out.println("");
        }

        }

    }

}
