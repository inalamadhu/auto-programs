package qa;

public class PrintDuplicateWords {

    public static void main(String[] args) {
        String str = "Welcome to new test to Welecom!";
        String[] s = str.split(" ");
        for(int i=0; i<s.length; i++){
            int c = 0;
            for(int j=0; j<s.length;j++){
                if(s[i].equals(s[j])){
                    ++c;
                }
            }
            if(c>1){
                System.out.println(s[i]);
            }
        }
    }

}
