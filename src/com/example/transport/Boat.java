package com.example.transport;

import com.example.transport.capability.HasScrew;
import com.example.transport.capability.LoadAble;

public class Boat extends Transport implements HasScrew, LoadAble {

    @Override
    public boolean hasScrew() {
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
