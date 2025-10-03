public class SMSSubscriber implements Subscriber{
    String userName;
    SMSSubscriber(String userName) {
        this.userName=userName;
    }
    public void upload(String videoTitle){
        System.out.println("Hi "+userName+"! Notification: video "+videoTitle+" uploaded");
    }
}
