public class Main {
    public static void main(String[] args) {
        boolean clientOS;
        char clientOperSys = 'O'; //Значение 'А' - Android; 'i' - iOS.
        if (clientOS = clientOperSys == 'A') {System.out.println("Download our application for Android here.");}
        else if (clientOS = clientOperSys == 'i') {System.out.println("Download our application for iOS here.");}
        else System.out.println("You use unknown operating system. Please contact to system administrator.");
          }
}