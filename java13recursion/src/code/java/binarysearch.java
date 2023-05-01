package code.java;

public class binarysearch {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,55,66,78};
    int target = 1;
        System.out.println(search(arr,target,0,arr.length -1));
    }
    static int search(int[] arr,int target, int s , int e){
        if(s>e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
           return search(arr,target,s,m-1);//when ever you calling a recursion call make sure you return it because
                                               // it is return type
        }

           return  search(arr,target,m+1,e);

    }
}
