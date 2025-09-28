public class MainBad {
    public static void main(String[] args) {
        String type="EMAIL";
        Notification notification;
        if(type.equalsIgnoreCase("EMAIL")){
            notification = new EmailNotification();
        } else if(type.equalsIgnoreCase("SMS")) {
            notification = new SMSNotification();
        } else {
            throw new IllegalArgumentException("Notification type "+type+" is not supported!");
        }
        //If we introduce a new notfication type, we need to modify the client code.
        //Client needs to know about the concrete classes EmailNotification and
        //SMSNotification, which is bad.
        notification.send();
    }
    
}
