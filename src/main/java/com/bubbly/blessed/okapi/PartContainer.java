package com.bubbly.blessed.okapi;

public class PartContainer {

    Integer first_part;
    Integer second_part;

    public PartContainer(Integer first_part, Integer second_part) {
        this.first_part = first_part;
        this.second_part = second_part;
    }

    public PartContainer() {
    }

    public Integer getFirst_part() {
        return first_part;
    }

    public void setFirst_part(Integer first_part) {
        this.first_part = first_part;
    }

    public Integer getSecond_part() {
        return second_part;
    }

    public void setSecond_part(Integer second_part) {
        this.second_part = second_part;
    }
}
