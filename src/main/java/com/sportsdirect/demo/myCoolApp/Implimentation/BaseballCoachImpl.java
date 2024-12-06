package com.sportsdirect.demo.myCoolApp.Implimentation;

import com.sportsdirect.demo.myCoolApp.Interface.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoachImpl implements Coach {
    @Override
    public String Dailyworkout() {
        return "Practice for 15 mins%%";
    }
}
