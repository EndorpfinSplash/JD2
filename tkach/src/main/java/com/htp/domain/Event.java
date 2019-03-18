package com.htp.domain;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    int id;
    String msg;
    Date date;
    DateFormat df;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event() {
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
