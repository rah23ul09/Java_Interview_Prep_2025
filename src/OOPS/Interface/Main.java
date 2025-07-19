package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        n1.send("Welcome to JAVA");

        Notification n2 = new SMSNotification();
        n2.send("OTP is 123455");
    }
}
