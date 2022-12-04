package osmonaliev;

import org.springframework.context.annotation.*;

@Configuration//applicationContex.xml
//@ComponentScan("osmonaliev")// <context:component-scan base-package="osmonaliev" />
@PropertySource("classpath:MusicPlayer.properties")
//<context:property-placeholder location="classpath:MusicPlayer.properties"/>
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(),classicalMusic());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
