package com.example.transport;

import com.example.transport.capability.HasWheels;

public class Taxi extends Transport implements HasWheels {
    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    void transport() {

    }
}
