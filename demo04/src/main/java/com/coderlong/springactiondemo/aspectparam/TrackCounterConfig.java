package com.coderlong.springactiondemo.aspectparam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from my Friends");
        tracks.add("Lucy in th Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a hole");
        tracks.add("爱你一万年");
        tracks.add("一生所爱");
        tracks.add("一生何求");
        cd.setTracks(tracks);

        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
