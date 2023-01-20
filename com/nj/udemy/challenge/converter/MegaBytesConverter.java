public class MegaBytesConverter {

        public static void main(String[] args) {

//        int input = 5000;
//        int mb = input / 1024;
//        int kb = input % 1024;
//        System.out.println(input + " KB = " + mb + " MB and " + kb + " KB");

            MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

       int megaBytes= kiloBytes / 1024;
       int reminder = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminder + " KB");

    }
}
