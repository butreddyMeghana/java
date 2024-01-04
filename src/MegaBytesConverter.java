public class MegaBytesConverter {
    public static void main(String[] args) {

      printMegaBytesAndKiloBytes(2500);
      printMegaBytesAndKiloBytes(-1);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabyte = 1024;
        int totalbytes = kiloBytes / megabyte;
        int remainingkb = kiloBytes % 1024;
        System.out.println(kiloBytes+"KB"+"="+totalbytes+"MB"+"and"+remainingkb+"KB");

        if (kiloBytes<0){
            System.out.println("invalid value");
        }
    }

}
