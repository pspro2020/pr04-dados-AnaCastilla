import java.util.Random;

public class Dice {

    private volatile int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0, number6 = 0;

    public void getDiceNumber() {

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(6)+1;

        synchronized (this) {
            if (rndNumber == 1) {
                number1++;
            } else if (rndNumber == 2) {
                number2++;
            } else if (rndNumber == 3) {
                number3++;
            } else if (rndNumber == 4) {
                number4++;
            } else if (rndNumber == 5) {
                number5++;
            } else if (rndNumber == 6) {
                number6++;
            }
        }
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public int getNumber4() {
        return number4;
    }

    public int getNumber5() {
        return number5;
    }

    public int getNumber6() {
        return number6;
    }

    public int total() {
        return number1+number2+number3+number4+number5+number6;
    }
}
