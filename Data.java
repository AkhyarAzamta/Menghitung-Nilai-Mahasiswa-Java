public class Data {
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
