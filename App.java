class Awal {
    
    public void Intro(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("====================================");
        System.out.println("= Menghitung Nilai Akhir Mahasiswa =");
        System.out.println("====================================");
        System.out.println("");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Awal pAwal = new Awal();
        pAwal.Intro();
        Menu pMenu = new Menu();
        pMenu.show();        
    }
}
