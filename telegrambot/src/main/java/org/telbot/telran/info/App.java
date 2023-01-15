package org.telbot.telran.info;

/*
1. User - ()
2. Channel list ()
3. Schedule for every user
4. Events for every eser
5. Statistic block


краткое описание public  api можно в ворде, можно свагер
смотреть образец
 */
//until 17/01/23
//1. Connect to database and create entity with fields for (Channel, Event, UserChannel, UserSchedule)
//2. Implement all Api and all services (for user, channels, userChannels, userSchedule)
//3. Documentation for Api
// I will send config for telegrambot
//17.01.23 we will check all project and discuss how to receive messages and run bot by scheduler.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class   App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
