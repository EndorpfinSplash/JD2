package com.htp.domain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private Client client;
    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public App() {
    }

    private static ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("App-config-Tkach.xml");

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("App-config-Tkach.xml");

        App app = (App) context.getBean("app");

        app.logEvent(null,"Some event for user 1" );
        app.logEvent(null, "Some event for user 2");
    }

    private void logEvent( EventType type,String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());

        Event event = (Event) context.getBean("event");
        event.setMsg(client.greeting + message);
        eventLogger.logEvent(event);
    }
}
