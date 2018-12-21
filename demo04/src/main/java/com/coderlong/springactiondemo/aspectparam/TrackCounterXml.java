package com.coderlong.springactiondemo.aspectparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 * 使用参数化的通知来记录磁道播放次数
 */
public class TrackCounterXml {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    public void trackPlayed(int trackNumber){}

    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)? trackCounts.get(trackNumber):0;
    }
}
