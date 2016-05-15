package com.nimbledroid.demo.dagger1.module;

import com.nimbledroid.demo.dagger1.MainActivity;
import com.nimbledroid.demo.dagger1.test.Test1;
import dagger.Module;
import dagger.Provides;

@Module(
    injects = {
        MainActivity.class,
        Test1.class,
    },
    includes = ModelModule.class
)
public class Dagger1Module {

    @Provides
    public Test1 provideTest1() {
        return new Test1();
    }
}
