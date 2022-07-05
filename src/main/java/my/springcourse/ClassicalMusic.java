package my.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }

    public static ClassicalMusic createClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println(">>> initialization classic music <<<");
    }

    public void doMyDestroy(){
        System.out.println(">>> destroying classic music <<<");
    }
}
