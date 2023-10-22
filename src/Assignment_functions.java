import java.util.Scanner;

public class Assignment_functions {
    public static void main(String[] args) {
        //Q-1 largest and smallest number
//        System.out.println("Enter your 1st numbers");
          Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.println("Enter your 2nd numbers");
//        int num2 = sc.nextInt();
//        System.out.println("Enter your 3rd numbers");
//        int num3 = sc.nextInt();
//        System.out.println(max(num1,num2,num3) + "--> Is your largest number");
//        System.out.println(min(num1,num2,num3) + "--> Is your smallest number");
        // Q-2 odd or even
//        System.out.println("Enter Your number for odd even identification");
//        int oddeve = sc.nextInt();
//        oddeve(oddeve);
        // Q-3
    }
    static int oddeve(int num1){
        if(num1%2==0){
            System.out.println(num1 + "-->is even");
        }else{
            System.out.println(num1 + "--> is odd");
        }
        return -1;
    }
    static int max(int n1, int n2 , int n3){
        int max=n1;
        while(true){
            if (n2 > max){
                max = n2;
            }else if (n3>max) {
                max = n3;
            }
            return max;
        }
    }
    static int min(int n1, int n2 , int n3){
        int min =n1;
        while(true){
            if (min>n2){
                min = n2;
            }else if (min>n3) {
                min = n3;
            }
            return min;
        }
    }
}
