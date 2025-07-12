package com.example.transport;

import com.example.capability.LoadAble;
import com.example.capability.HasScrew;

public class Tanker extends Transport implements HasScrew, LoadAble {

    @Override
    public boolean hasScrew() {
        return true;
    }

    @Override
    public void transport() {
        // TODO: implement
    }

    @Override
    public void load() {
        // TODO: implement
    }
}
