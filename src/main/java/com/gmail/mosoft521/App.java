package com.gmail.mosoft521;

import com.gmail.mosoft521.cp.jxc.gui.login.LoginDialog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginDialog login = new LoginDialog(context);
        login.setVisible(true);
        System.out.println("bye!");
    }
}
