package com.example.demo.models;


import java.time.LocalDate;
import java.time.LocalTime;

public class TweeterFact {
    private String      tweetText;
    private String      userName;
    private LocalDate   tweetDate;
    private LocalTime   tweetTime;
    private String      publish;


    public TweeterFact(String tweetText, String publish, String userName){
        this.tweetText  = tweetText;
        this.userName   = userName;
        tweetDate       = LocalDate.now();
        tweetTime       = LocalTime.now();
    }
        public String getTweetText(){
        return tweetText;
    }
    public String getName(){
        return userName;
    }

    public LocalDate getTweetDate(){
        return tweetDate;
    }
    public LocalTime getTweetTime(){
        return tweetTime;
    }
    public String getPublish(){
        return publish;
    }

    public void setName(String userName){
        this.userName = userName;
    }
    public void setTweetText(String tweetText){
        this.tweetText = tweetText;
    }
    @Override
    public String toString(){
        return this.tweetText;
    }
}
