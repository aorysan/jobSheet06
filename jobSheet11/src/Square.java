package jobSheet11.src;

import java.util.*;
public class Square {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        for(int iOuter = 0; iOuter <= N; iOuter++) {
            for(int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
