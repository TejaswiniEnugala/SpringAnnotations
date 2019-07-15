package com.stackroute.springannotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;@Configuration
public class AppConfig {

    @Bean
    public Movie movie(){
        return new Movie(getActor());
    }
    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }

    @Bean
    public Actor getActor(){
        Actor actor = new Actor("teju","Female",21);
        return actor;
    }

    @Bean(initMethod="customInit", destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean beanLifeCycleDemoBean(){
        return new BeanLifeCycleDemoBean();
    }


}