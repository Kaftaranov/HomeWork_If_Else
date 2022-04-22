public class Main {
    public static void main(String[] args) {
        //Задание №1
        boolean clientOS;
        char clientOperSys = 'i'; //Значение 'А' - Android; 'i' - iOS.
        if (clientOS = clientOperSys == 'A') {
            System.out.println("Download our application for Android here.");
        } else {
            System.out.println("Download our application for iOS here.");
        }
        System.out.println("-----------------------------------------");

        //Задание №2
        int clientDeviceYear = 2015;
        if (clientOS && clientDeviceYear < 2015) {
            System.out.println("We recommend you to install light version of our application for Android from here.");
        }
        if (clientOS && clientDeviceYear >= 2015) {
            System.out.println("Congratulations! Your device will work properly with our newest application for Android! You may download it here.");
        }
        if (!clientOS && clientDeviceYear < 2015) {
            System.out.println("We recommend you to install light version of our application for iOS from here.");
        }
        if (!clientOS && clientDeviceYear >= 2015){
            System.out.println("Congratulations! Your device will work properly with our newest application for iOS! You may download it here.");
        }
        System.out.println("-----------------------------------------");

        //Задание №3
        int year = 2021;
        if (year%4 == 0 && year%100 == 0 && year%400 == 0) {System.out.println("The year "+ year+" is leap. It happens once in 400 years!");}
        else if (year%4 == 0 && year%100 != 0) {System.out.println("The year "+year+" is leap year.");}
        else {System.out.println("The year "+year+" is not leap.");}
        System.out.println("-----------------------------------------");

        //Задание №4
        int deliveryDistance = 20;
        short deliveryZone;
        if (deliveryDistance <= 20) {deliveryZone = 1;}
        if (deliveryDistance > 20 && deliveryDistance <= 60) {deliveryZone = 2;}
        if (deliveryDistance > 60 && deliveryDistance <= 100) {deliveryZone = 3;}
        else {deliveryZone = 4;}
        switch (deliveryZone)
        {
            case 1: System.out.println("Delivery will take 1 day");
            break;
            case 2: System.out.println("Delivery will take 2 days");
            break;
            case 3: System.out.println("Delivery will take 3 days");
            break;
            case 4: System.out.println("We are sorry, but you are out of our delivery service area.");
            break;}
        }
    }



