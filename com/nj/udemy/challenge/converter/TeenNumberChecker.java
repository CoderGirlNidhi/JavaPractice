public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }
    public static boolean hasTeen (int a, int b, int c) {

//        return isTeen(a) || isTeen(b) || isTeen(c);

        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

//    public static boolean isTeen (int a) {
//        return a >= 13 && a <= 19;
//    }
}
