public class Search_in_range_03 {
    public static void main(String[] args) {
        int[] nums = {1,23,654,78,23,45,21,34};
        int target = 23;
        int ans = linerSearchRange(nums,target , 2,6);
        System.out.println(ans);
    }
    static int linerSearchRange(int[] arr, int target, int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
        // running the loop
        for (int index = start; index <= end; index++) {
            //check for all index if target matches element
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
