public class AudioPlayer {
    public void play(String audioType, String fileName) {
        IMediaPlayer player;
        switch (audioType.toLowerCase()) {
            case "mp3" -> {
                player = name -> System.out.println("Playing MP3 file: " + name);
                player.play(fileName);
            }
            case "mp4" -> new MediaAdapter(new Mp4Player()).play(fileName);
            case "vlc" -> new MediaAdapter(new VlcPlayer()).play(fileName);
            default -> System.out.println("Invalid media type: " + audioType);
        }
    }
}
