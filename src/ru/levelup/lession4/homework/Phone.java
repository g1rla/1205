package ru.levelup.lession4.homework;

public class Phone {
    public String number;
    public String model;
    public float weight;
    public String name;
    public String receivedNumber;

    public Phone(String number, String model, float weight) {
        //this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        // this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receive(String name, String number) {
        //this.name = name;
        //this.number = number;
        String res = "Звонит " + name + " телефон: " + number;
        System.out.println("Звонит " + name + " телефон: " + number);
        //return res;
    }

    public String getNumber() {
        return number;
    }


    public void sendMessages(String[] receivedNumber) {
        //receivedNumber[0] = "11111111111";
        //receivedNumber[1] = "33333333333";
        //receivedNumber[2] = "55555555555";
        int i;
        for (i = 0; i < 3; i++) {
            String res = "На номер " + receivedNumber[i] + "было отправлено сообщение с номера " + number;
            System.out.println(res);
        }
    }
}







