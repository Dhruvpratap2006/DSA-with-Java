public class Main {
        public static String findSubString(String s , int si, int ei) {
                String str = " ";
                for(int i = si; i < ei; i++) {
                        str += s.charAt(i);
                }
                return str;
        }
    public static void main(String[] args) {
            String s = "HelloWorld";
            System.out.println(findSubString(s , 0 , 5));
        System.out.println("Hello World!");
    }
}
