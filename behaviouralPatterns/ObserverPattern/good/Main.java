public class Main {
    public static void main(String[] args) {
        Channel channel=new YoutubeChannel("Ammi's kitchen");
        channel.subscribe(new SMSSubscriber("Mahima"));
        channel.subscribe(new EmailSubscriber("mahima@gmail.com"));
        channel.uploadVideo("Recipe for Chana masala");
    }
}
