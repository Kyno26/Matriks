package matriks;

import java.util.Scanner;

/**
 *
 * @author Suisei
 */
public class Matriks {

    public static void main(String[] args) {
        int matriks1[][] = new int[5][5];
        int matriks2[][] = new int [5][5];
        int hasil[][] = new int [5][5];
        Scanner elemen = new Scanner(System.in);
        
        System.out.println("=== Operasi matriks ===");
        System.out.println(" 1. Penjumlahan\n 2. Pengurangan");
        System.out.print("\nMasukan pilihan operasi: ");
        Scanner pilihOperasi = new Scanner(System.in);
        int pilih = pilihOperasi.nextInt();
        
        //jumlah baris & kolom
        System.out.print("\nMasukan jumlah baris; ");
        Scanner jmlBaris = new Scanner(System.in);
        int x = jmlBaris.nextInt();
        System.out.print("Masukan jumlah kolom: ");
        Scanner jmlKolom = new Scanner(System.in);
        int y = jmlKolom.nextInt();
        
        //input elemen matriks1
        System.out.println("\n= Masukan Elemen Matriks ke-1 =");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("elemen ke-["+i+","+j+"]: ");
                matriks1[i][j] = elemen.nextInt();
            }
        }
        //Input elemen matriks2
        System.out.println("\n= Masukan Elemen Matriks ke-2 =");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("elemen ke-["+i+","+j+"]: ");
                matriks2[i][j] = elemen.nextInt();
            }
        }
        
        switch (pilih) {
            case 1:
                System.out.println("\n= Penjumlahan Matriks =");
                System.out.println("Hasil: ");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        hasil[i][j] = matriks1 [i][j] + matriks2[i][j];
                        System.out.print(hasil[i][j] +"\t");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("\n= Pengurangan Matriks =");
                System.out.println("Hasil: ");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        hasil[i][j] = matriks1 [i][j] - matriks2[i][j];
                        System.out.print(hasil[i][j] +"\t");
                    }
                    System.out.println("\n");
                }
                break;
        }
    }
    
}
