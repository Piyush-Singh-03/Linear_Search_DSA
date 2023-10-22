public class findmin_04 {
    public static void main(String[] args) {
        int[] arr = {1,23,654,78,23,45,21,34};
        System.out.println(min(arr));
    }
    //assume arr.length != 0
    //return minimum value of array
    static int min(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }else{
                return min;
            }
        }return min;
    }
}
