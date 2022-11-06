package calculator_;

import java.util.Scanner;

public class Calculate_dynamic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char cikis;
        System.out.println("Welcome Calculator");
        do {
            System.out.println("işlem yapmak istediğiniz ilk sayıyı giriniz");
            double sayi1 = scan.nextDouble();
            System.out.println("işlem yapmak istediğiniz ikinci sayıyı giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.println("************\n" +
                    "Toplama işlemi için +'ya basınız\n" +
                    "Cıkarma(eksiltme) işlemi için -'ye basınız\n" +
                    "Bolme işlemi için /'ye basınız\n" +
                    "Çarpma işlemi için *'ya\n" +
                    "\t\t\t\t\tBeta Version 1.0\n" +
                    "********************************");
            char islem = scan.next().charAt(0);
            double sonuc = 0;

            if (islem == '+') {
                System.out.println("toplama işlemi yaptınız. Sonuc :" + (sayi1 + sayi2));
                sonuc = sayi1 + sayi2;
            } else if (islem == '-') {
                System.out.println("çıkarma işlemi yaptınız. Sonuc :" + (sayi1 - sayi2));
                sonuc = sayi1 - sayi2;
            } else if (islem == '/') {
                System.out.println("Bölme işlemi yaptınız. Sonuc :" + (sayi1 / sayi2));
                sonuc = sayi1 / sayi2;
            } else if (islem == '*') {
                System.out.println("Çarpma işlemi yaptınız. Sonuc :" + (sayi1 * sayi2));
                sonuc = sayi1 * sayi2;
            } else {
                System.out.println("hatalı işlem");
            }
            System.out.println(sonuc);
            System.out.println("Tekrar işlem yapmak için herhangi bir tuşa basınız\nÇıkış için q'ya basınız");
            cikis = scan.next().charAt(0);

        } while (cikis!='q');


    }

}
