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
        int year = 2024;
        if (year%4 == 0 && year%100 == 0 && year%400 == 0) {System.out.println("The year "+ year+" is leap. It happens once in 400 years!");}
        else if (year%4 == 0 && year%100 != 0) {System.out.println("The year "+year+" is leap year.");}
        else {System.out.println("The year "+year+" is not leap.");}
        System.out.println("-----------------------------------------");

        //Задание №4
        int deliveryDistance = 59;
        short deliveryZone = 0;
        if (deliveryDistance < 20) {deliveryZone = 1;}
        if (deliveryDistance >= 20 && deliveryDistance < 60){deliveryZone = 2;}
        if (deliveryDistance >= 60 && deliveryDistance < 100) {deliveryZone = 3;}
        if (deliveryDistance >= 100){deliveryZone = 4;}
        switch (deliveryZone) {
            case 1: System.out.println("Delivery will take 1 day"); break;
            case 2: System.out.println("Delivery will take 2 days"); break;
            case 3: System.out.println("Delivery will take 3 days"); break;
            case 4: System.out.println("We are sorry, but you are out of our delivery service area."); break;
        }

        //Задание №5
        short monthNumber = 12;
        short seasonNumber = 0;
        if (monthNumber ==12 || monthNumber == 1 || monthNumber == 2) {seasonNumber = 1;}
        if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {seasonNumber = 2;}
        if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {seasonNumber = 3;}
        if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {seasonNumber = 4;}
        if (monthNumber > 12 || monthNumber <= 0) {System.out.println("Please check the number of month!");}
        switch (seasonNumber){
        case 1: System.out.println("Now it is winter. Wear warm clothing!"); break;
        case 2: System.out.println("Now it is spring. Buy flowers for your girl!"); break;
        case 3: System.out.println("Now it is summer. Have a rest and go to sea!"); break;
        case 4: System.out.println("It is autumn. Keep your feet dry and warm."); break;}

        }
    }



