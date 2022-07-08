package my.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    String[] songs = {"Hungarian Rhapsody",
                        "Dance of the Hours!",
                        "The tale of Tsar Saltan!"};

    private ClassicalMusic() {
    }

    public static ClassicalMusic createClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        Random rnd = new Random();
        return songs[rnd.nextInt(songs.length)];
    }

    public void doMyInit(){
        System.out.println(">>> initialization classic music <<<");
    }

    public void doMyDestroy(){
        System.out.println(">>> destroying classic music <<<");
    }
}
