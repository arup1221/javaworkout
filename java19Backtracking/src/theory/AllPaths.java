package theory;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
//        allpaths("",board,0,0);
//        System.out.println("hwa");
            allpathsPrint("",board,0,0,path,1);

    }

    static void allpaths(String p,boolean[][] maze, int r, int c){
        if(r == maze.length -1 && c == maze[0].length-1){  // Base condition

            return;
        }

        if(!maze[r][c]){    //maze[r][c] == false
            return;

        }
        //I am considering this block is my path
        maze[r][c] = false;
        if(r<maze.length - 1){
            allpaths(p + 'D',maze,r+1,c);

        }
        if(c<maze[0].length-1){
            allpaths(p + 'R',maze,r,c+1);

        }
       if(r>0) {
           allpaths(p + "u",maze,r-1,c);
       }
       if(c>0) {
           allpaths(p+"L",maze,r,c-1);
       }

       //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
    static void allpathsPrint(String p,boolean[][] maze, int r, int c ,int[][] path,int step){
        if(r == maze.length -1 && c == maze[0].length-1){  // Base condition
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){    //maze[r][c] == false
            return;

        }
        //I am considering this block is my path
        maze[r][c] = false;

        path[r][c] = step;

        if(r<maze.length - 1){
            allpathsPrint(p + 'D',maze,r+1,c,path,step+1);

        }
        if(c<maze[0].length-1){
            allpathsPrint(p + 'R',maze,r,c+1,path,step+1);

        }
        if(r>0) {
            allpathsPrint(p + "u",maze,r-1,c,path,step+1);
        }
        if(c>0) {
            allpathsPrint(p+"L",maze,r,c-1,path,step+1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
