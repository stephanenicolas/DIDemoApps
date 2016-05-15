package com.nimbledroid.demo.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.dagger2.R;
import com.nimbledroid.demo.dagger2.manager.TestManager;
import com.nimbledroid.demo.dagger2.manager.TestManager10;
import com.nimbledroid.demo.dagger2.manager.TestManager11;
import com.nimbledroid.demo.dagger2.manager.TestManager12;
import com.nimbledroid.demo.dagger2.manager.TestManager13;
import com.nimbledroid.demo.dagger2.manager.TestManager14;
import com.nimbledroid.demo.dagger2.manager.TestManager15;
import com.nimbledroid.demo.dagger2.manager.TestManager2;
import com.nimbledroid.demo.dagger2.manager.TestManager3;
import com.nimbledroid.demo.dagger2.manager.TestManager4;
import com.nimbledroid.demo.dagger2.manager.TestManager5;
import com.nimbledroid.demo.dagger2.manager.TestManager6;
import com.nimbledroid.demo.dagger2.manager.TestManager7;
import com.nimbledroid.demo.dagger2.manager.TestManager8;
import com.nimbledroid.demo.dagger2.manager.TestManager9;
import com.nimbledroid.demo.dagger2.module.Dagger2Module;
import com.nimbledroid.demo.dagger2.test.Test1;
import com.nimbledroid.demo.dagger2.test.Test10;
import com.nimbledroid.demo.dagger2.test.Test11;
import com.nimbledroid.demo.dagger2.test.Test12;
import com.nimbledroid.demo.dagger2.test.Test13;
import com.nimbledroid.demo.dagger2.test.Test14;
import com.nimbledroid.demo.dagger2.test.Test15;
import com.nimbledroid.demo.dagger2.test.Test16;
import com.nimbledroid.demo.dagger2.test.Test17;
import com.nimbledroid.demo.dagger2.test.Test18;
import com.nimbledroid.demo.dagger2.test.Test19;
import com.nimbledroid.demo.dagger2.test.Test2;
import com.nimbledroid.demo.dagger2.test.Test20;
import com.nimbledroid.demo.dagger2.test.Test21;
import com.nimbledroid.demo.dagger2.test.Test22;
import com.nimbledroid.demo.dagger2.test.Test23;
import com.nimbledroid.demo.dagger2.test.Test24;
import com.nimbledroid.demo.dagger2.test.Test25;
import com.nimbledroid.demo.dagger2.test.Test26;
import com.nimbledroid.demo.dagger2.test.Test27;
import com.nimbledroid.demo.dagger2.test.Test28;
import com.nimbledroid.demo.dagger2.test.Test29;
import com.nimbledroid.demo.dagger2.test.Test3;
import com.nimbledroid.demo.dagger2.test.Test30;
import com.nimbledroid.demo.dagger2.test.Test31;
import com.nimbledroid.demo.dagger2.test.Test32;
import com.nimbledroid.demo.dagger2.test.Test33;
import com.nimbledroid.demo.dagger2.test.Test34;
import com.nimbledroid.demo.dagger2.test.Test35;
import com.nimbledroid.demo.dagger2.test.Test36;
import com.nimbledroid.demo.dagger2.test.Test37;
import com.nimbledroid.demo.dagger2.test.Test38;
import com.nimbledroid.demo.dagger2.test.Test39;
import com.nimbledroid.demo.dagger2.test.Test4;
import com.nimbledroid.demo.dagger2.test.Test40;
import com.nimbledroid.demo.dagger2.test.Test5;
import com.nimbledroid.demo.dagger2.test.Test6;
import com.nimbledroid.demo.dagger2.test.Test7;
import com.nimbledroid.demo.dagger2.test.Test8;
import com.nimbledroid.demo.dagger2.test.Test9;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private final static int INJECTIONS = 51200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long start = System.currentTimeMillis();
        D2EComponent component = DaggerD2EComponent.builder().dagger2Module(new Dagger2Module()).build();
        long end = System.currentTimeMillis();
        System.out.println("Time to setup activity injector " + (end-start));
        for (int injection = 0; injection <= INJECTIONS/100; injection ++) {
            component.inject(new Test1());
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time to inject members" + (end2 - end));

    }
}
