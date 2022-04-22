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
    }
//Задание №3

}


