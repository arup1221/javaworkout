import java.util.Arrays;

public class flipimage {
    public static void main(String[] args) {
        int[][] arr = {{ 1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(arr.length);
        int [][] ans = flipAndInvertImage(arr);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//
//        }
        for(int[] gh : ans){
            System.out.println(Arrays.toString(gh));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reverse this array
            for(int i = 0; i<(image[0].length + 1)/2; i++){
                //swap
                int temp = row[i]^1; //in  simple (first) row [ 1,2,3] which is store in temp
                row[i]= row[image[0].length - i -1]^1;// now row i store (3-0-1 = 2:3 ,, 3-1-1 = 1:2,, 3-2-1 = 3:1) [3,2,1]
                row[image[0].length - i - 1]= temp; // now you what is here

            }
        }
        return image;
    }
}
