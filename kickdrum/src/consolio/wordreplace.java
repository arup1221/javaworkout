package consolio;

public class wordreplace {
    public static void main(String[] args) {
        String str = "arup gope";
        char ch1 = 'g';
        char ch2 = 'a';
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch1){
                res =res + ch2;
            }
            else if(str.charAt(i) == ch2){
                res = res + ch1;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }


}
