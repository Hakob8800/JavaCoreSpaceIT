package chapter2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Java");
        SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");


        for (int i = 0; i < 50; i++) {
            System.out.println(sdf.format(new Date()));
            Thread.sleep(250);

        }
        Date dat = new Date();
        System.out.println(dat.getTime());
    }
}
