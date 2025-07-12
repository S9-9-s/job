package com.example.transport;

import com.example.transport.capability.HasScrew;
import com.example.transport.capability.HasWheels;
import com.example.transport.capability.LoadAble;

public class Helicopter extends Transport implements HasWheels, HasScrew, LoadAble {

    @Override
    public boolean hasScrew() {
        return true;
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public void load() {
        // TODO: implement
    }

    @Override
    void transport() {
        // TODO: implement
    }
}
