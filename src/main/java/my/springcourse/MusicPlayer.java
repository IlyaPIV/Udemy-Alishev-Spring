package my.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private int volume;
    private String name;

    // IoC
    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        for (Music track:
             music) {
            System.out.println("Playing: " + track.getSong());
        }

    }
}
