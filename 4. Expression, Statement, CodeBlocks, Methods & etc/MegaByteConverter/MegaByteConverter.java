public class MegaByteConverter {
    public static void main(String args[]){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int MegaBytes = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + remaining + " KB");
             }
      }
}
