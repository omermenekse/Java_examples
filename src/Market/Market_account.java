package Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market_account {

    public static void main(String[] args) {
        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
         * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
         * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
         * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
         * kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
         * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
         * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
         * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
         * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 5. Adım :
         * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
         * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
         * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
         * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * ortalama kazançtan aşağıysa o günleri return yap.
         */

        List<String> haftagunleri= new ArrayList<>();
        haftagunleri.add("Pazartesi");
        haftagunleri.add("Salı");
        haftagunleri.add("Çarşamba");
        haftagunleri.add("Perşembe");
        haftagunleri.add("Cuma");
        haftagunleri.add("Cumartesi");
        haftagunleri.add("Pazar");
        List<Double> kazanc= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        int gunler=0;
        int sayac= haftagunleri.size();
        while (sayac>0){

            System.out.println("her gün için ayrı ayrı kazıncınızı girin");
            System.out.println(haftagunleri.get(gunler));
            double gunlukkazanci= scan.nextDouble();
            kazanc.add(gunlukkazanci);
            gunler++;
            sayac--;

        }
        double toplamKazanc=0;
        for (int i = 0; i <kazanc.size() ; i++) {
            toplamKazanc+= kazanc.get(i);
        }

        double ortalamaKazanc= toplamKazanc/haftagunleri.size();
//* getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
// * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
// * günleri return yap.
        List<String> ortalamaKazancUstuGun= new ArrayList<>();
        for (int i = 0; i <kazanc.size() ; i++) {
            if (kazanc.get(i)>ortalamaKazanc){
                ortalamaKazancUstuGun.add(haftagunleri.get(i));
            }
        }
/*
getOrtalamaninAltindaKazancGünleri() adlı
                * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *ortalama kazançtan aşağıysa o günleri return yap.
 */
        List<String> ortalamaKazancaltiGun= new ArrayList<>();
        for (int i = 0; i <kazanc.size() ; i++) {
            if (kazanc.get(i)<ortalamaKazanc){
                ortalamaKazancaltiGun.add(haftagunleri.get(i));
            }
        }
        System.out.println(haftagunleri);
        System.out.println("Kazanc listesi:\n "+ haftagunleri+"\n"
                +"\t"+kazanc);
        System.out.println("Ortalama kazanç :" +ortalamaKazanc);
        System.out.println("Ortalama altı kazanç günleri :" +ortalamaKazancaltiGun);
        System.out.println("Ortalama üstü kazanc günleri :" +ortalamaKazancUstuGun);



    }
}
