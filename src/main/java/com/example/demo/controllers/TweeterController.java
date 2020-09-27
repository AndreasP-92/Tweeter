package com.example.demo.controllers;

import com.example.demo.models.TweeterFact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TweeterController {
    List<TweeterFact> listOfTweets = new ArrayList<>();

//    TweeterFact tweeterToDisplay = new TweeterFact("Hello World", "Andreas");



    @GetMapping("/")
    public String index(Model TweeterController){

        TweeterController.addAttribute("tweeterToDisplay", listOfTweets);


        return "index";
    }

    @PostMapping("/postTweeterFact")
    public String postTweeterFact(WebRequest dataFromForm){
        String tweeterPublic = dataFromForm.getParameter("tweeterPublic");
        int parsedTweeterPublic = 0;

        if(Boolean.parseBoolean(tweeterPublic) == true) {
            parsedTweeterPublic = 1;
        }
        TweeterFact tweeterFromForm = new TweeterFact(dataFromForm.getParameter("tweeterfact"),parsedTweeterPublic, "Andreas");
        listOfTweets.add(tweeterFromForm);
//        tweeterToDisplay = tweeterFromForm;
        return "redirect:/";
    }
    @GetMapping("/privateTweets")
    public String privateTweets(Model TweeterController){

        TweeterController.addAttribute("tweeterToDisplay", listOfTweets);


        return "privateTweets";
    }

}
