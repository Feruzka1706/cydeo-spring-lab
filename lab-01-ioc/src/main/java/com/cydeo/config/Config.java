package com.cydeo.config;


import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

     @Bean
     Currency currency(){
          Currency currency = new Currency();
          currency.setName("abc");
          currency.setCode("xvyz");
          return currency;
     }
    @Bean
    Saving getSavingBean( ){
         Saving saving = new Saving();
         saving.setCurrency(currency());
        return saving;
    }

    @Bean
    Current getCurrentBean( ){
        Current current = new Current();
        current.setCurrency(currency());
        return current;
    }

}
