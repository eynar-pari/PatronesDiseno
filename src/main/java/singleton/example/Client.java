package singleton.example;

import prototype.basic.ConcretePrototype;

public class Client {

    public static void main(String []args){

        // Loger
        Persona persona1 = new Persona();
        persona1.setAcccionCaminar("value1");
        persona1.setAcccionCabeza("value2");
        persona1.setAcccionMano("value3");
        persona1.setAcccionPies("value4");

        Robot robot1 = new Robot();
        robot1.setAcccionPies("r value1");
        robot1.setAcccionMano("r value2");
        robot1.setAcccionCaminar("r value 3");
        robot1.setAcccionCabeza("r value 4");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Persona persona1Thread = new Persona();
                persona1Thread.setAcccionCaminar("value1");
                persona1Thread.setAcccionCabeza("value2");
                persona1Thread.setAcccionMano("value3");
                persona1Thread.setAcccionPies("value4");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Robot robot1Thread = new Robot();
                robot1Thread.setAcccionPies("r value1");
                robot1Thread.setAcccionMano("r value2");
                robot1Thread.setAcccionCaminar("r value 3");
                robot1Thread.setAcccionCabeza("r value 4");
            }
        });

        thread1.start();
        thread2.start();
    }
}
