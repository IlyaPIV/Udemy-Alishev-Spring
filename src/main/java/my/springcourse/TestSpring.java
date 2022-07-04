package my.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        appContext.close();
    }
}
