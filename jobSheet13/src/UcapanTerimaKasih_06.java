import java.util.*;
public class UcapanTerimaKasih_06 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
