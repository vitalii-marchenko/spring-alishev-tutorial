package ua.marchenko.spring;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
}
