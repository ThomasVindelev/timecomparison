import java.time.LocalTime;

public class TimeTesting {

    int h1 = 10;
    int m1 = 30;
    int s1 = 20;

    int h2 = 12;
    int m2 = 30;
    int s2 = 20;

    int h3 = 12;
    int m3 = 20;
    int s3 = 30;


    public void method() {

        LocalTime film_1_før = LocalTime.of(h1, m1, s1);
        LocalTime film_1_efter = LocalTime.of(h2, m2, s2);
        LocalTime film_2_før = LocalTime.of(h3, m3, s3);

        System.out.println("Film 1 starter klokken " + film_1_før);
        System.out.println("Film 1 slutter klokken " + film_1_efter);
        System.out.println("Film 2 starter klokken " + film_2_før);

        //Her testes om den planlagte film vil slutte før den næste film skal på - hvis ikke vil den fejle

        System.out.println("\n" + film_1_efter.isBefore(film_2_før));

        System.out.println(film_1_efter.isAfter(film_2_før));

    }

}
