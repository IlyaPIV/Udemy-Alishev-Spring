package my.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;


@Scope("singleton")
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


    @PostConstruct
    public void doMyInit(){
        System.out.println(">>> initialization classic music <<<");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println(">>> destroying classic music <<<");
    }
}
