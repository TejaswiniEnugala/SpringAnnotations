package com.stackroute;

import com.stackroute.springannotations.AppConfig;
import com.stackroute.springannotations.BeanLifeCycleDemoBean;
import com.stackroute.springannotations.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.actorInformation();

        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean(BeanLifeCycleDemoBean.class);
        context.close();
    }
}