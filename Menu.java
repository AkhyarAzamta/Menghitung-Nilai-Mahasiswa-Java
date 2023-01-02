import java.util.Scanner;

public class Menu extends Data {
    Scanner str = new Scanner(System.in);

    public Menu() {

        System.out.print("NAMA : ");
        setNama(str.nextLine());
        System.out.print("ABSENSI : ");
        setAbsensi(str.nextInt());
        System.out.print("TUGAS : ");
        setTugas(str.nextInt());
        System.out.print("UTS : ");
        setUts(str.nextInt());
        System.out.print("UAS : ");
        setUas(str.nextInt());
        nilai = (0.15 *getAbsensi() + 0.20*getTugas() + 
        0.30*getUts() + 0.35*getUas());
    }

    public void show() {

        if (nilai >= 70){
            ket = "LULUS!";
        }else{
            ket = "TIDAK LULUS!";
        }

        System.out.println("");
        System.out.println("Nama : " + getNama());
        System.out.println("Nilai Akhir : " + nilai);
        System.out.println("Keterangan : " + ket);
        System.out.println("");
        System.out.println("");
    }
}
