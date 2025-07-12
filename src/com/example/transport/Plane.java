package com.example.transport;

import com.example.capability.HasScrew;
import com.example.capability.HasWheels;
import com.example.capability.HasWings;
import com.example.capability.LoadAble;

public class Plane extends Transport implements HasWheels, HasScrew, HasWings, LoadAble {

    @Override
    public boolean hasScrew() {
        return true;
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasWings() {
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
