package Jobsheet11;

public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa10() {

    }

    public Mahasiswa10(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.err.println("\nNIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Ipk  : " + ipk);
    }
}