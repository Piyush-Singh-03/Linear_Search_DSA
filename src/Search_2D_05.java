import java.util.Arrays;

public class Search_2D_05 {
    public static void main(String[] args) {
        int arr2d[][] ={
                {2,3,4,5},
                {4,6,12,34},
                {45,645,2}
        };
        int target = 12;
        int[] ans = searcharr(arr2d,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searcharr(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
