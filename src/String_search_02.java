public class String_search_02 {
    public static void main(String[] args) {
        String name = "Piyush";
        char target = 'i';
        System.out.println(search(name, target));

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
