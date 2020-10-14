public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice();

        Thread t1 = new Thread(new DiceTask(dice));
        Thread t2 = new Thread(new DiceTask(dice));
        Thread t3 = new Thread(new DiceTask(dice));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.printf("A thread has been interrupted");
        }

        System.out.println("Número 1: " + dice.getNumber1() + " veces");
        System.out.println("Número 2: " + dice.getNumber2() + " veces");
        System.out.println("Número 3: " + dice.getNumber3() + " veces");
        System.out.println("Número 4: " + dice.getNumber4() + " veces");
        System.out.println("Número 5: " + dice.getNumber5() + " veces");
        System.out.println("Número 6: " + dice.getNumber6() + " veces");
        System.out.println("Total de veces: " + dice.getNumber1() + " + " + dice.getNumber2() + " + "
                + dice.getNumber3() + " + " + dice.getNumber4() + " + " + dice.getNumber5() + " + "
                + dice.getNumber6() + " = " + dice.total());

    }
}
