public class max_2d_06 {
    public static void main(String[] args) {
        int[][] arr2dim ={
                {2,3,4,5},
                {4,6,12,34},
                {45,645,2}
        };
        int ans = searchMax(arr2dim);
        System.out.println(ans);
    }
    static int searchMax(int[][] arr){
        int max = arr[0][0]; // or you can use Integer.MIN_VALUE; which is basically lowst value array can hold
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

