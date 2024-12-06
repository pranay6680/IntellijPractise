package com.sportsdirect.demo.myCoolApp.Implimentation;

import com.sportsdirect.demo.myCoolApp.Interface.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Primary
public class TrackCoachImpl implements Coach {
    @Override
    public String Dailyworkout() {
        return "i am done";
    }
}
