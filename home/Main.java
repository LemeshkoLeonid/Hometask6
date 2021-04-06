package home;

class Phone {
    String number;
    String model;
    double weight;

    Phone(String num, double weig, String mod) {
        number = num;
        model = mod;
        weight = weig;
    }

    Phone(String num, String mod) {
        number = num;
        model = mod;
        weight = 0;
    }

    Phone() {
        number = "underfined";
        model = "underfined";
        weight = 0;
    }

    String getNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Phone user1 = new Phone();
        Phone user2 = new Phone("380931234567", "iphone");
        Phone user3 = new Phone("380501234567", 75.8, "samsung");

        System.out.println("user1:");
        System.out.println("Number: " + user1.number + " " + "Weight: " + user1.weight + " " + "Model: " + user1.model);
        System.out.println("user2:");
        System.out.println("Number: " + user2.number + " " + "Weight: " + user2.weight + " " + "Model: " + user2.model);
        System.out.println("user3:");
        System.out.println("Number: " + user3.number + " " + "Weight: " + user3.weight + " " + "Model: " + user3.model);

        String user1_number = user1.getNumber();
        String user2_number = user2.getNumber();
        String user3_number = user3.getNumber();

        user1.receiveCall("Name1");
        user2.receiveCall("Name2");
        user3.receiveCall("Name3");
    }

}


