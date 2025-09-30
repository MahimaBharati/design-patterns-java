import java.util.ArrayList;
import java.util.List;
public class Playlist {
    List<Video> videos;
    Playlist() {
        this.videos=new ArrayList<>();
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }

    public List<Video> getVideos(){
        return videos;
    }
}
