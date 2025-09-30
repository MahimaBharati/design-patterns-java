public class Main {

    public static void main(String[] args){
        YoutubePlaylist playlist=new YoutubePlaylist();
        playlist.addVideo(new Video("Iterator pattern"));
        playlist.addVideo(new Video("Adapter pattern"));
        playlist.addVideo(new Video("Factory pattern"));
        YoutubePlaylistIterator iterator = playlist.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
