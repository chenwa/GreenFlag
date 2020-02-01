package com.example.greenflag;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {
    public static List<User> db;

    public static void init() {
        db = new ArrayList<>();
    }
}
