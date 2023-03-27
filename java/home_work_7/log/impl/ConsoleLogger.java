package home_work_7.log.impl;

import home_work_7.log.Logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String txt) {
        System.out.println(LocalDateTime.now() + ": " + txt);
    }
}
