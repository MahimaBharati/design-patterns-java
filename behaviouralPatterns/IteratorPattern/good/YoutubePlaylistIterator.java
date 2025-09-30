import java.util.List;
public class YoutubePlaylistIterator implements PlaylistIterator{
    List<Video> videos;
    int position;
    YoutubePlaylistIterator(List<Video> videos){
        this.videos=videos;
        position=0;
    }
    public boolean hasNext(){
        return position<videos.size();
    }
    public Video next(){
        return hasNext()?videos.get(position++):null;
    }
}
