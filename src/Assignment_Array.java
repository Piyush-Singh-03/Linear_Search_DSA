public class Assignment_Array {
    public static void main(String[] args) {
        // return number of Even digits
        int[] nums = {12,345,654,57,-21,455,32};
//        System.out.println(findnumbers(nums));
//        System.out.println(digits(12345));
        System.out.println(digits2(1293943));
    }
    static int findnumbers(int[] nums){
        int count =0;
        for( int num : nums){
            if(even(num)){
                count++;
            }
        }return count;
    }
    //function to check weather number has even digit or not
    static boolean even(int num){
        int numberofdigits = digits(num);
        return numberofdigits%2 ==0;
    }
 //   count number of digits
    static int digits2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }
        if(num ==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
