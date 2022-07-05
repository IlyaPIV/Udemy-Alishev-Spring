package my.springcourse;

import org.springframework.stereotype.Component;

@Component("somePopMusic")
public class PopMusic implements Music{

    private PopMusic(){
    }

    public static PopMusic createPopMusic(){
        return new PopMusic();
    }

    @Override
    public String getSong() {
        return "Bye bye bye!";
    }
}
