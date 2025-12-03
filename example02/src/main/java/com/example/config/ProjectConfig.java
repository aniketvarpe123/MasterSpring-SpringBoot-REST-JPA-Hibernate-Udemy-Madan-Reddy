package com.example.config;

import com.example.beans.vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    vehicle vehicle ()
    {
      var veh =new vehicle();
      veh.setName("Audi 9");
      return veh;
    }
    @Bean
    String hello ()
    {
        return "Hello World";
    }   
    @Bean
    Integer number()
    {
        return 16;
    }
}
