import java.util.ArrayList;
import java.util.List;
public class YoutubeChannel implements Channel{
    String channelName;
    List<Subscriber> subscribers= new ArrayList<Subscriber>();
    YoutubeChannel(String name){
        channelName=name;
    }
    public void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        this.subscribers.remove(subscriber);
    }

    void notifySubscribers(String video){
        for(Subscriber subscriber:subscribers){
            subscriber.upload(video);
        }
    }

    public void uploadVideo(String video){
        System.out.println("Uploading video "+video+" to channel:"+channelName);
        notifySubscribers(video);
    }
}
