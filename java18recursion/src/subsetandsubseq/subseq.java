package subsetandsubseq;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
//        SubseqAscii("","abc");
      //  System.out.println(SubseqAsciiRet("", "abc"));
        //System.out.println(SubseqRet("","abc"));
        Subseq("","abc");
    }
    static void Subseq(String p, String up){
        if(up.isEmpty()){ //base condition
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        Subseq(p+ch, up.substring(1)); // take it
        Subseq(p,up.substring(1)); // ignore it
    }

    static ArrayList<String> SubseqRet(String p, String up){
        if(up.isEmpty()){ //base condition
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = SubseqRet(p+ch, up.substring(1)); // take it
        ArrayList<String> right = SubseqRet(p,up.substring(1)); // ignore it

//        left.addAll(right);
//        return left;
        right.addAll(left);
        return right;
    }
    static void SubseqAscii(String p, String up){
        if(up.isEmpty()){ //base condition
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        SubseqAscii(p+ch, up.substring(1)); // take it
        SubseqAscii(p,up.substring(1)); // ignore it
        SubseqAscii(p + (ch + 0), up.substring(1));
    }
    static ArrayList<String> SubseqAsciiRet(String p, String up){
        if(up.isEmpty()){ //base condition
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = SubseqAsciiRet(p+ch, up.substring(1)); // take it
        ArrayList<String> second = SubseqAsciiRet(p,up.substring(1)); // ignore it
        ArrayList<String> third = SubseqAsciiRet(p+(ch + 0),up.substring(1));
//        left.addAll(right);
//        return left;
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
