package theory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args)  {
//        System.out.println(count(3,3));
//        path("", 3,3);
//
//        System.out.println(pathRetDigonal("",3,3));

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestiction("",board,0,0);

    }
    static int count(int r, int c){
        if(r == 1|| c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        int corner = count(r-1,c-1);

        return left + right + corner;
    }

    static void path(String p, int r, int c){
        if(r==1 && c ==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p + 'D',r-1,c);

        }
        if(c>1){
            path(p + 'R',r,c-1);

        }
    }
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c ==1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
           list.addAll( pathRet(p + 'D',r-1,c));

        }
        if(c>1){
            list.addAll( pathRet(p + 'R',r,c-1));

        }
        return list;
    }
    static ArrayList<String> pathRetDigonal(String p, int r, int c){
        if(r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll( pathRetDigonal(p + 'D',r-1,c));

        }
        if(c>1){
            list.addAll( pathRetDigonal(p + 'R',r,c-1));

        }
        if(r>1 && c>1){
            list.addAll( pathRetDigonal(p + 'C',r-1,c-1));

        }
        return list;
    }
    static void pathRestiction(String p,boolean[][] maze, int r, int c){
        if(r == maze.length -1 && c == maze[0].length-1){  // Base condition
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){    //maze[r][c] == false
            return;
        }
        if(r<maze.length - 1){
            pathRestiction(p + 'D',maze,r+1,c);

        }
        if(c<maze[0].length-1){
            pathRestiction(p + 'R',maze,r,c+1);

        }
        if(r< maze.length-1 && c< maze[0].length-1){
             pathRestiction(p + 'C',maze,r+1,c+1);

        }

    }
}