public class EmailSubscriber implements Subscriber{
    String emailId;
    EmailSubscriber(String emailId) {
        this.emailId =emailId;
    }
    public void upload(String videoTitle){
        System.out.println("Hi "+emailId+"! Notification: video "+videoTitle+" uploaded");
    }
}
