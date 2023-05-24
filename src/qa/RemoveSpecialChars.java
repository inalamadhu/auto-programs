package qa;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "this(*(*( is (*( n(*ew ))*)*te(*(*st";
        String res = "";
        for(int i=0; i<str.length(); i++){
            if(!Character.isWhitespace(str.charAt(i))){
                if(Character.isAlphabetic(str.charAt(i))) {
                    res += str.charAt(i);
                }
            }else{
                res += " ";
            }
        }
        System.out.println(res);
    }
}
