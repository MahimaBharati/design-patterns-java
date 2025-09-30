import java.util.List;
import java.util.ArrayList;
public class YoutubePlaylist implements Playlist{
    List<Video> videos;
    YoutubePlaylist(){
        this.videos=new ArrayList<>();
    }
    void addVideo(Video video){
        this.videos.add(video);
    }
    public YoutubePlaylistIterator createIterator(){
        return new YoutubePlaylistIterator(videos);
    }
}
