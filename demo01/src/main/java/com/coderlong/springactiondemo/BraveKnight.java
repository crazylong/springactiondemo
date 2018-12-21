package com.coderlong.springactiondemo;

/**
 * @autor Long Qiong
 * @create 2017/10/24
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
