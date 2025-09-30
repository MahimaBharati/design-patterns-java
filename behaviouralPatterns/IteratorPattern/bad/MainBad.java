public class MainBad {
    public static void main(String[] args) {
        Playlist videos = new Playlist();
        videos.addVideo(new Video("Adapter Pattern"));
        videos.addVideo(new Video("Iterator Pattern"));
        for(Video video:videos.getVideos()) {
            System.out.println(video.getTitle());
        }
    }
}
