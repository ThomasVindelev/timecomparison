import java.time.LocalTime;

public class TimeTesting {

    int h1 = 10;
    int m1 = 30;
    int s1 = 20;

    int h2 = 12;
    int m2 = 30;
    int s2 = 20;


    public void method() {

        LocalTime localTime1 = LocalTime.of(h1, m1, s1);
        LocalTime localTime2 = LocalTime.of(h2, m2, s2);

        System.out.println("Tid 1 er " + localTime1);
        System.out.println("Tid 2 er " + localTime2);

        System.out.println(localTime1.isAfter(localTime2));

    }

}
