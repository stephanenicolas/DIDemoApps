package com.nimbledroid.demo.roboguice;

import android.app.Activity;
import android.os.Bundle;
import com.demo.roboguice.R;
import com.nimbledroid.demo.roboguice.test.Test1;
import roboguice.RoboGuice;
import roboguice.inject.ContextScopedRoboInjector;

public class MainActivity extends Activity {
    private final static int INJECTIONS = 51200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long start = System.currentTimeMillis();
        RoboGuice.setupBaseApplicationInjector(getApplication());
        long end = System.currentTimeMillis();
        System.out.println("Time to setup application injector " + (end - start));
        final ContextScopedRoboInjector injector = RoboGuice.getInjector(this);
        long end2 = System.currentTimeMillis();
        System.out.println("Time to setup activity injector " + (end2 - end));
        for (int injection = 0; injection <= INJECTIONS/100; injection ++) {
            injector.injectMembers(new Test1());
        }

        long end3 = System.currentTimeMillis();
        System.out.println("Time to inject members" + (end3 - end2));

        setContentView(R.layout.activity_main);
    }
}
