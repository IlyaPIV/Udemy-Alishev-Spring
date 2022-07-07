package my.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        PopMusic popMusic               = appContext.getBean("somePopMusic", PopMusic.class);
//        ClassicalMusic classicalMusic   = appContext.getBean("classicalMusic", ClassicalMusic.class);
//        RockMusic rockMusic             = appContext.getBean("rockMusic", RockMusic.class);
//
//        List<Music> playlist = new ArrayList<>();
//        playlist.add(popMusic);
//        playlist.add(classicalMusic);
//        playlist.add(rockMusic);
//
////        MusicPlayer musicPlayer = new MusicPlayer(playlist);
//
//
//        System.out.println("Name: " + musicPlayer.getName());
//        System.out.println("Volume: " + musicPlayer.getVolume());
//        musicPlayer.playMusic();

//        MusicPlayer player = appContext.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
//
//        MusicPlayer firstPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println();
//        System.out.println(firstPlayer + "\t?\t" + secondPlayer + "\t=\t" + (firstPlayer==secondPlayer));

        Computer computer = appContext.getBean("computer", Computer.class);
        System.out.println(computer);

        appContext.close();
    }
}
