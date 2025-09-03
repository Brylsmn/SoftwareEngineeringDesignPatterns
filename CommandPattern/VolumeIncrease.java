public class VolumeIncrease implements Command{
    private MusicPlayer musicPlayer;
    public VolumeIncrease (MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public String execute() {
        return musicPlayer.increase();
    }
}
