package ua.marchenko.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicPlayer {
    private ClassicalMusic music;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic music, RockMusic rockMusic) {
        this.music = music;
        this.rockMusic = rockMusic;
    }

    private String name;
    private int volume;

    // Inversion of Control (IoC)
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(ClassicalMusic music) {
        this.music = music;
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
