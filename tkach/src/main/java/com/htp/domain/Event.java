package com.htp.domain;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    int id;
    String msg;
    Date date;
    DateFormat df = DateFormat.getDateInstance();

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event() {
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
    }

    public Event(String msg, Date date, DateFormat df) {
        this.msg = msg;
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg +
                ", date=" + df.format(date) +
                '}';
    }
}
