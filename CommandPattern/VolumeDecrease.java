public class VolumeDecrease {
    private MusicPlayer musicPlayer;
    public VolumeDecrease (MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public String execute() {
        return musicPlayer.decrease();
    }
}
