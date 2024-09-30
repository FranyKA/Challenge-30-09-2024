import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Waktu = new Scanner(System.in);
        System.out.println("Enter Waktu (t) = ");
        float waktu = Waktu.nextFloat();

        Scanner Banyak_Gelombang = new Scanner(System.in);
        System.out.println("Enter Banyak gelombang (n) = ");
        float banyak_gelombang = Banyak_Gelombang.nextFloat();
        
        System.out.println("Frekuensi = " + banyak_gelombang / waktu + "Hz");
        System.out.println("Periode = " + waktu / banyak_gelombang + "s");
    }

}
