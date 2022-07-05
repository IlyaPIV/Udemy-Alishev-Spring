package my.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    private RockMusic(){
    }

    public static RockMusic createRockMusic(){
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
