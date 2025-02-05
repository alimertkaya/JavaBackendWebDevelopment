import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner in = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = in.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = in.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = in.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = in.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = in.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = in.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println((sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
