
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        Scanner ders =  new Scanner(System.in) ;

        System.out.println("mat notunu gir");
        int mat = ders.nextInt() ;
        System.out.println(mat);

        System.out.println("fizik?");
        int fizik = ders.nextInt();
        System.out.println(fizik);

        System.out.println("biyo?");
        int biyo= ders.nextInt();
        System.out.println(biyo);

        int toplam = (mat+fizik+biyo);
        double sonuc = (toplam/6.0);
        System.out.println("Ortalaman" + sonuc);


        String durum = sonuc>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.println(durum);

    }
}


