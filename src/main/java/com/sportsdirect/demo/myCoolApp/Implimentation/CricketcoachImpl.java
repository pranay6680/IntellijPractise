package com.sportsdirect.demo.myCoolApp.Implimentation;

import com.sportsdirect.demo.myCoolApp.Interface.Coach;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class CricketcoachImpl implements Coach {
    @Override
    public String Dailyworkout(){
        return "Practise every day for 10 mins!!!";
    }
}
