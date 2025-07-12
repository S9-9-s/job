package com.example.transport;

import com.example.capability.HasWheels;

public class Truck extends Transport implements HasWheels {
    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    void transport() {

    }
}
