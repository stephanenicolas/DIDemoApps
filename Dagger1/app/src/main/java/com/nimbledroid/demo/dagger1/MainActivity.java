package com.nimbledroid.demo.dagger1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.demo.dagger1.R;
import com.nimbledroid.demo.dagger1.module.Dagger1Module;
import com.nimbledroid.demo.dagger1.module.ModelModule;
import com.nimbledroid.demo.dagger1.test.Test1;
import dagger.ObjectGraph;

public class MainActivity extends AppCompatActivity {
    private final static int INJECTIONS = 51200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long start = System.currentTimeMillis();
        ObjectGraph objectGraph = ObjectGraph.create(new Dagger1Module(), new ModelModule());
        long end = System.currentTimeMillis();
        System.out.println("Time to setup activity injector " + (end - start));
        for (int injection = 0; injection <= INJECTIONS / 100; injection++) {
            objectGraph.inject(new Test1());
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time to inject members" + (end2 - end));
    }
}

