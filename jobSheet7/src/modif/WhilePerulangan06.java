package jobSheet7.src.modif;

import java.util.*;
public class WhilePerulangan06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int kelipatan, counter=0, jumlah=0;
       double rata;

       System.out.println("Masukkan bilangan kelipatan (1-9) : ");
       kelipatan = sc.nextInt();

       int i=1;
       while (i <= 50) {
        i++;
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
       }
       rata = (double) jumlah / counter;
       System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
       System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
       System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata);

       sc.close();
    } 
    
}
