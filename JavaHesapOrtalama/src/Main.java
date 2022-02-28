import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("MTürkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat+ fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız =" + ortalama);
        String sonuc= (ortalama < 60) ? "Kaldınız." : "Geçtiniz.";
        System.out.println(sonuc);
    }
}