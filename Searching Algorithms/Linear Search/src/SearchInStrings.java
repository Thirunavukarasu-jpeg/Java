public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println(searchInString("Thiru",'u'));
    }
    static int searchInString(String str,char target) {
        if(!str.isEmpty()) {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == target) {
//                    return i;
//                }
//            }
            for (char s: str.toCharArray()) {
                if(s ==  target) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
