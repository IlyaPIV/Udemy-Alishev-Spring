package my.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        Random rnd = new Random();
        Genre genre = Genre.values()[rnd.nextInt(3)];
        return "Computer{" +
                "id=" + id +
                "} musicPlayer:\n" + musicPlayer.playMusic(genre);
    }
}
