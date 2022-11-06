package random_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Random_date {
    public static void main(String[] args) {

        Random random = new Random();
        int yil= random.nextInt(2013,2100);
        int ay=  random.nextInt(1,13);
        int gun=  random.nextInt(1,32);
        System.out.println(yil);
        System.out.println(ay);
        System.out.println(gun);
        /*LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve
        random tarih uretin
        degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
        bunu yaptiktan sonra
*/
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd.MM.YYYY EEEE");

        LocalDate tarih = LocalDate.of(yil,ay,gun);
        System.out.println(tarih.format(dtf1));

    }
}
