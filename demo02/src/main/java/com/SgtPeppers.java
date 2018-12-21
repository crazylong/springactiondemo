package com;

import org.springframework.stereotype.Component;

/**
 * @autor Long Qiong
 * @create 2017/10/26
 */
//@Component("lonelyHeartsClub") //显示设置bean名为 lonelyHeartsClub 也可用 @Named("lonelyHeartsClub")
@Component  //默认bean名为 sgtPeppers
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
