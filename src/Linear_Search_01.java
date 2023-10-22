public class Linear_Search_01 {
    public static void main(String[] args) {
        int[] nums = {1,23,654,78,23,45,21,34};
        int target = 21;
        int ans = linerSearch(nums,target);
        System.out.println(ans);

    }
    // Search in array , return if item's index
    // otherwise return -1
    static int linerSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // running the loop
        for(int index =0;index<arr.length;index++){
            //check for all index if target matches element
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if target isn't found
        return -1;
    }
    // Search in array , return if item itself
    static int linerSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // running the loop
        for (int element : arr) {
            //check for all index if target matches element
            if (element == target) {
                return element;
            }
        }
        //if target isn't found
        return -1;
    }
    // Search in array , return true or false
    static boolean linerSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        // running the loop
        for (int element : arr) {
            //check for all index if target matches element
            if (element == target) {
                return true;
            }
        }
        //if target isn't found
        return false;
    }
}
