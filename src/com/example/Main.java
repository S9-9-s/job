package com.example;

import com.example.transport.capability.LoadAble;
import com.example.transport.Tanker;

import java.util.ArrayList;
import java.util.List;

/*
В эти поведенческие интерфейсы я добавила методы возвращающие boolean (true/false)
отвечая на вопрос имеет ли наследник возможность/способность сделать это.
Но это только для демонстрации.
Эти интерфейсы проще использовать как маркеры (без методов) для обобщенного кода (через дженерики).
 */
public class Main<T> {
    public static void main(String[] args) {
        List<? super LoadAble> loadAbles = new ArrayList<>();
        Tanker tanker = new Tanker();
        loadAbles.add(tanker);
    }
}
