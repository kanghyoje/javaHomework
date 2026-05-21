package practice;

class SmartPhone {
    String model;
    int battery;

    public SmartPhone(String model) {
        this.model = model;
        this.battery = 50;
    }
    public void charge(int amount) {
        this.battery += amount;
        if (this.battery > 100) {
            this.battery = 100;
        }
    }

    public void showStatus() {
        System.out.println(this.model + "의 현재 배터리는 " + this.battery + "%입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone");

        myPhone.showStatus();
        myPhone.charge(25);
        myPhone.showStatus();
        System.out.println(myPhone);
    }
}
