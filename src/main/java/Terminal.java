public class Terminal {
    private int currentMoney;

    public Terminal(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public synchronized void payment(String person, int money) {
        System.out.println(person + " came to the ATM");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (money <= this.currentMoney) {
            this.currentMoney -= money;
            System.out.println(person  + " withdraw: " + money);
            System.out.println("Left " + this.currentMoney);
        } else {
            System.out.println(person + " money ran out");
        }

    }

}
