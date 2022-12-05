package ru.levelup.lession4.homework;

public class PhoneApp {
    public static void main(String[] args) {

        Phone Iphone = new Phone("11111111111", "Apple 13", 300);
        Iphone.model = "Apple 13";
        Iphone.number = "11111111111";
        Iphone.weight = 300;
        Iphone.name = "Nelly";
        // Iphone.getNumber();

        Phone Samsung = new Phone("33333333333", "Galaxy A 32");
        Samsung.model = "Galaxy A 32";
        Samsung.number = "33333333333";
        Samsung.weight = 400;
        Samsung.name = "Eva";

        Phone Huawei = new Phone("55555555555", "P40 Pro Plus", 500);
        Huawei.model = "P40 Pro Plus";
        Huawei.number = "55555555555";
        Huawei.weight = 500;
        Huawei.name = "Dmitriy";

        System.out.println("Iphone: \nmodel: "  + Iphone.model + " Номер: " + Iphone.number + " Вес: " + Iphone.weight);
        System.out.println("Samsung: \nmodel: " + Samsung.model + " Номер: " + Samsung.number);
        System.out.println("Huawei: \nmodel: " + Huawei.model + " Номер: " + Huawei.number + " Вес: " + Huawei.weight);

//        System.out.println("Звонит " + Iphone.name + " " + Iphone.getNumber());
//        System.out.println("Звонит " + Samsung.name + " " + Samsung.getNumber());
//        System.out.println("Звонит " + Huawei.name + " " + Huawei.getNumber());

        //System.out.println(Iphone.receive("Nelly", "11111111111"));
        //System.out.println(Iphone.sendMessages("55555555555"));
        String[] receivedNumber = new String[3];
        receivedNumber[0] = "11111111111";
        receivedNumber[1] = "33333333333";
        receivedNumber[2] = "55555555555";
        Iphone.sendMessages(receivedNumber);




    }

}
