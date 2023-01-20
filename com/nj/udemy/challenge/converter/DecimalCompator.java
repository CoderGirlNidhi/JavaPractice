public class DecimalCompator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces( double a, double b) {

        a= a*1000;
        b= b*1000;

        if(a < 0) {
            a = Math.ceil(a);
        }
        else {
            a = Math.floor( a );
        }
        if( b > 0) {
            b = Math.floor( b );
        } else {
            b = Math.ceil( b );
        }

        return a == b;

    }


}
