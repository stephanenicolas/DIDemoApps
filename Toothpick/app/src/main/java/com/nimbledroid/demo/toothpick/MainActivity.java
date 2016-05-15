package com.nimbledroid.demo.toothpick;

import android.app.Activity;
import android.os.Bundle;
import com.demo.toothpick.R;
import com.nimbledroid.demo.toothpick.test.Test1;
import toothpick.Scope;
import toothpick.ToothPick;
import toothpick.registries.FactoryRegistryLocator;
import toothpick.registries.MemberInjectorRegistryLocator;

public class MainActivity extends Activity {

    private final static int INJECTIONS = 51200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long start = System.currentTimeMillis();
        final Scope scope = ToothPick.openScope(getApplication());
        MemberInjectorRegistryLocator.setRootRegistry(new com.nimbledroid.demo.toothpick.MemberInjectorRegistry());
        FactoryRegistryLocator.setRootRegistry(new com.nimbledroid.demo.toothpick.FactoryRegistry());
        long end = System.currentTimeMillis();
        System.out.println("Time to setup activity injector " + (end - start));
        for (int injection = 0; injection <= INJECTIONS/100; injection ++) {
            scope.getInstance(Test1.class);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time to inject members" + (end2 - end));

        setContentView(R.layout.activity_main);
    }
}
