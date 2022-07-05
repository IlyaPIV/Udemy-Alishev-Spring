package my.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());
        musicPlayer.playMusic();

        MusicPlayer firstPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
        System.out.println();
        System.out.println(firstPlayer.toString() + "\t?\t" + secondPlayer.toString() + "\t=\t" + (firstPlayer==secondPlayer));

        appContext.close();
    }
}
