public class SearchInRange {
    public static void main(String[] args) {
        System.out.println(searchInRange("Thiru",2,4,'u'));
    }
    static boolean searchInRange(String str, int start, int end, char target) {
        if(!str.isEmpty()) {
            for (int i = start; i <= end; i++) {
                if(str.charAt(i) ==  target) {
                    return true;
                }
            }
        }
        return false;
    }
}
