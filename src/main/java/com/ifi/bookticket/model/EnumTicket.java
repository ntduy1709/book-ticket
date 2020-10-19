package com.ifi.bookticket.model;

public enum EnumTicket {
    TICKET3D("3D"),
    TICKET2D("2D");
    private String value;

    EnumTicket(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
