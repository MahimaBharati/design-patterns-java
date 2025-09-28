public class Main {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification("Email");
        Notification smsNotification = NotificationFactory.createNotification("SMS");
        NotificationService service=new NotificationService();
        service.sendNotification(emailNotification);
        service.sendNotification(smsNotification);
    }
    
}
