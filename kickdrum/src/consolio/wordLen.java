package consolio;

public class wordLen {
    public static void main(String[] args) {
        String s = "Hello World";


        int len =0;

//        for(int i=0; i<s.length();i++){
//            if(s.charAt(i) == ' '){
//                len =0;
//            }
//            else {
//                len ++;
//            }
//        }
        s = s.trim();
        int totalLen = s.length();
        int lastIndex = s.lastIndexOf(' ');
        len = totalLen - lastIndex -1;
        System.out.println(len);
    }
}
