package my.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    //private List<Music> music = new ArrayList<>();

    @Autowired
    private PopMusic music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private int volume;
    private String name;

    // IoC
//    public MusicPlayer(List<Music> music){
//        this.music = music;
//    }
//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {
    }

//    public void setMusic(List<Music> music) {
//        this.music = music;
//    }
//    @Autowired
//    public void setMusic(Music music) {
//    this.music = music;
//}

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

    public String playMusic(){
//        for (Music track:
//             music) {
//            System.out.println("Playing: " + track.getSong());
//        }
        return "Playing: " + music.getSong() +
                "\nPlaying: " + rockMusic.getSong() +
                "\nPlaying: " + classicalMusic.getSong();
    }
}
