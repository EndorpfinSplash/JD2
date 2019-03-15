package com.htp.domain;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Engine {
    Float volume;
    Float price ;

    public Engine() {
        this.volume = 20f;
        this.price = 1000f;
    }

    public Engine(Float volume, Float price) {
        this.volume = volume;
        this.price = price;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(volume, engine.volume) &&
                Objects.equals(price, engine.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(volume, price);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", price=" + price +
                '}';
    }
}
