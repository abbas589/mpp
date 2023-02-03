package com.miu.mpp.lab9.partii.q12;

import java.util.Optional;

/**
 * @author bazz
 * Feb 02 2023
 * 19:10
 */
public class MySingletonLazy {
    private static MySingletonLazy instance = null;
    private static int instanceCount = 0;

    private MySingletonLazy() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static MySingletonLazy getInstance() {
        instance = Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
        return instance;
    }
}
