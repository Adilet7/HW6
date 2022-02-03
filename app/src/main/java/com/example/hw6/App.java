package com.example.hw6;

import android.app.Application;

import androidx.room.Room;

import com.example.hw6.room.AppDataBase;
import com.google.firebase.auth.FirebaseAuth;

public class App extends Application {
    AppDataBase db;
    public static App app;
    FirebaseAuth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "database").allowMainThreadQueries().build();
    }

    public AppDataBase getDb() {
        return db;
    }

    public static App getApp() {
        return app;
    }
}
