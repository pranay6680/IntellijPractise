package com.sportsdirect.demo.myCoolApp.controller;


import com.sportsdirect.demo.myCoolApp.Interface.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class FunRestCont {

   private Coach mycoach;

   @Autowired
   public FunRestCont(Coach myTeacher){
       mycoach = myTeacher;
   }

    public FunRestCont() {

    }

    @GetMapping("/gana")
   public String Hello1() {
       return mycoach.Dailyworkout();
    }



}
