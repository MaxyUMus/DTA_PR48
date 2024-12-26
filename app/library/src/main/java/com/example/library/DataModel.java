package com.example.library;

import java.io.Serializable;

public class DataModel implements Serializable {
    private String data;

    public DataModel(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
