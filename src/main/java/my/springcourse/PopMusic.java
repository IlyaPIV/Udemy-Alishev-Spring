package my.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("somePopMusic")
@Scope("prototype")
public class PopMusic implements Music{

    String[] songs = {"Bye bye bye!",
                        "Gangnamstyle!",
                        "I like to move it!"};

    private PopMusic(){
    }

    public static PopMusic createPopMusic(){
        return new PopMusic();
    }

    @Override
    public String getSong() {
        Random rnd = new Random();
        return songs[rnd.nextInt(songs.length)];
    }
}
