public class MediaAdapter implements IMediaPlayer {
    private final IAdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(IAdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.play(fileName);
    }
}
