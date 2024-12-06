package com.sportsdirect.demo.myCoolApp.Implimentation;

import com.sportsdirect.demo.myCoolApp.Interface.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoachImpl implements Coach {
    @Override
    public String Dailyworkout() {
        return "Play for 30 mins";
    }
}
