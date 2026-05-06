package Jobsheet11;

import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());
            Mahasiswa10 mhsBaru = new Mahasiswa10(nim, nama, kelas, ipk);
            sll.addLast(mhsBaru);
        }
        System.out.println();
        sll.print();
    }
}
