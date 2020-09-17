package service;

import model.UserTransactions;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserTransactions userTransactions = context.getBean("userTransactions", UserTransactions.class);
        System.out.println(userTransactions);
        context.close();
    }
}
