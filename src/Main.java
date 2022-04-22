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
        int leapYear = 2300;
        if (leapYear%4 == 0 && leapYear%100 == 0 && leapYear%400 == 0) {System.out.println("The year "+ leapYear+" is leap. It happens once in 400 years!");}
        else if (leapYear%4 == 0 && leapYear%100 != 0) {System.out.println("The year "+leapYear+" is leap year.");}
        else {System.out.println("The year "+leapYear+" is not leap.");}
        System.out.println("-----------------------------------------");

        //Задание №4

    }

}


