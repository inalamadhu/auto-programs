package qa;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 ={45,22,47,85,96};
        int[] arr2 = {35,48,65,12,58};

        int n = arr1.length + arr2.length;
        int[] res = new int[n];
        System.arraycopy(arr1,0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);

        System.out.println(res);
    }


}
