package my.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class MusicPlayer {
    //private List<Music> music = new ArrayList<>();

    @Autowired
    @Qualifier("somePopMusic")
    private Music popMusic;
    @Qualifier("classicalMusic")
    private Music classicalMusic;
    @Qualifier("rockMusic")
    private Music rockMusic;

    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name;


//    public MusicPlayer(List<Music> music){
//        this.music = music;
//    }
//    @Autowired
//    public MusicPlayer(Music music){
//        this.music = music;
//    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
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

    public String playMusic(Genre genre){
        String song = String.format("Player %s on volume %d - ", name, volume);
        switch (genre){
            case POP: song = song + "Playing pop: " + popMusic.getSong();
                        break;
            case ROCK: song = song + "Playing rock: " + rockMusic.getSong();
                        break;
            default: song = song + "Playing classic: " + classicalMusic.getSong();
        }
        return song;
    }
}
