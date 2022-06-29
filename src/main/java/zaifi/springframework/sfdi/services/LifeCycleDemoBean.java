package zaifi.springframework.sfdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean {

    public LifeCycleDemoBean() { System.out.println("## LifeCycleDemoBean Constructor ##");}

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The LifeCycle bean has its factory set ##");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean name is: " + s + " ##");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycle bean has been terminated ##");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycle bean has its properties set ##");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set ##");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The PostConstruct annotated method has been called ##");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The PreDestroy annotated method has been called ##");
    }

    public void beforeInit() {
        System.out.println("## Before Init -- Called by Bean PostProcessor ##");
    }

    public void afterInit() {
        System.out.println("## After Init -- Called by Bean PostProcessor ##");
    }
}
