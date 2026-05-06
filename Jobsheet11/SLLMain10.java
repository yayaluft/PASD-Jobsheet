package Jobsheet11;

public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("2201", "Naufal", "1A", 4.0);
        Mahasiswa10 mhs2 = new Mahasiswa10("2202", "Citra", "3C", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("2003", "Nindya", "2B", 3.8);
        Mahasiswa10 mhs4 = new Mahasiswa10("2204", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs4);
        sll.print();
    }
}
