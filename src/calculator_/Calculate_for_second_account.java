package calculator_;

import java.util.Scanner;

public class Calculate_for_second_account {
    public static void main(String[] args) {
        System.out.println("************\nHesap Makinesi\n"+"--------------\n" +
                "Toplama işlemi için +'ya basınız\n"+
                "Cıkarma(eksiltme) işlemi için -'ye basınız\n"+
                "Bolme işlemi için /'ye basınız\n"+
                "Çarpma işlemi için *'ya\n"+
                "\t\t\t\t\tBeta Version 1.0\n"+
                "********************************");
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen ilk sayıyı girin");
        double sayi1= scan.nextDouble();
        System.out.println("lütfen ikinci yayı girin");
        double sayi2= scan.nextDouble();
        System.out.println("lütfen yapmak istediğiniz işlemi seçin");
        char islem= scan.next().charAt(0);
        double sonuc=0;

        if( islem=='+') {
            System.out.println("toplama işlemi yaptınız. Sonuc :" + (sayi1+sayi2));
            sonuc= sayi1+sayi2;
        }else if(islem=='-'){
            System.out.println("çıkarma işlemi yaptınız. Sonuc :" + (sayi1-sayi2));
            sonuc= sayi1-sayi2;
        }else if(islem=='/'){
            System.out.println("Bölme işlemi yaptınız. Sonuc :" + (sayi1/sayi2));
            sonuc= sayi1/sayi2;
        }else if(islem=='*'){System.out.println("Çarpma işlemi yaptınız. Sonuc :" + (sayi1*sayi2));
            sonuc= sayi1*sayi2;
        }
        else {
            System.out.println("hatalı işlem");
        }
        System.out.println(sonuc);
        double kaln= sonuc;
        System.out.println("**"+kaln);


//bakiye üzerinden işlem yapmak
        System.out.println("İşleminize yapılan işlem üzerinden devam "+
                "etmek için 'e' tuşuna çıkış için 'q' tuşuna basınız");

        char devam=scan.next().charAt(0);

        switch (devam){
            case 'q':
            System.out.println("işleminiz bitmiştir");
            break;
            case 'e':
            System.out.println("************\nHesap Makinesi\n" + "--------------\n" +
                    "Toplama işlemi için +'ya basınız\n" +
                    "Cıkarma(eksiltme) işlemi için -'ye basınız\n" +
                    "Bolme işlemi için /'ye basınız\n" +
                    "Çarpma işlemi için *'ya\n" +
                    "********************************");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                char islem1 = scan.next().charAt(0);
                double bakiye=sonuc;

                System.out.println("lütfen işlem yapmak istediğiniz sayıyı girin");
                double sayi4= scan.nextDouble();

                if(islem1=='+'){
                    System.out.println("Yapılan işlem sonucu ile toplama işlemi yaptınız");
                    System.out.println("Sonuc: "+ (bakiye+sayi4));
                } else if (islem1=='-') {
                    System.out.println("Yapılan işlem sonucu ile çıkarma işlemi yaptınız");
                    System.out.println("Sonuc: "+ (bakiye+sayi4));
                }else if (islem1=='/') {
                    System.out.println("Yapılan işlem sonucu ile bölme işlemi yaptınız");
                    System.out.println("Sonuc: " + (bakiye / sayi4));
                }else if (islem1=='*') {
                    System.out.println("Yapılan işlem sonucu ile çarpma işlemi yaptınız");
                    System.out.println("Sonuc: "+ (bakiye*sayi4));

                }
        }






    }
}
