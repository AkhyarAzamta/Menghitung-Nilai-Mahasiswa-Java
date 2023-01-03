import java.util.Scanner;

class Method {
    private String nama;
    public String ket;
    private double absensi, uts, uas, tugas;
    public double nilai;

    public void setAbsensi(double absensi) {
        this.absensi = absensi;
    }

    public double getAbsensi() {
        return absensi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUas() {
        return uas;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUts() {
        return uts;
    }
}


class IsiData extends Method {
    Scanner str = new Scanner(System.in);

    public IsiData() {

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

class Awal {
    
    public void Intro(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("====================================");
        System.out.println("= Menghitung Nilai Akhir Mahasiswa =");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("");
    }
}
    class App {
    public static void main(String[] args) throws Exception {
        Awal pAwal = new Awal();
        pAwal.Intro();
        IsiData pIsiData = new IsiData();
        pIsiData.show();        
    }
}
