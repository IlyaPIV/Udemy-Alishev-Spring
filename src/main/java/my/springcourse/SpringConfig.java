package my.springcourse;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("my.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return ClassicalMusic.createClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return RockMusic.createRockMusic();
    }

    @Bean
    @Scope("prototype")
    public PopMusic popMusic(){
        return PopMusic.createPopMusic();
    }



    @Bean
    @Scope("prototype")
    public List<Music> playList() {
        return Arrays.asList(rockMusic(), popMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(playList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
