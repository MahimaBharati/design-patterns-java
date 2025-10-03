public class YoutubeChannel {
    String name;
    YoutubeChannel(String name){
        this.name=name;
    }
    void upload(String video) {
        System.out.println("Uploading video "+video+" to the channel "+name);
        //Sending notifications
        System.out.println("Sending in-app push notifications to user123");
        System.out.println("Sending email notifications to user@123");
    }
}
