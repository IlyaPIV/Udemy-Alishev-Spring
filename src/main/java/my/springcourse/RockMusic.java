package my.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music{

    String[] songs = {"It's my life",
                        "Wind cries Mary",
                        "Thunderstruck"};

    private RockMusic(){
    }

    public static RockMusic createRockMusic(){
        return new RockMusic();
    }

    @Override
    public String getSong() {
        Random rnd = new Random();
        return songs[rnd.nextInt(songs.length)];
    }
}
