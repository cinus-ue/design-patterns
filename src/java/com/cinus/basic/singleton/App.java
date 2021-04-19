package com.cinus.basic.singleton;

import com.cinus.util.LogUtils;

public class App {


    public static void main(String[] args) {

        // eagerly initialized singleton
        SingleObject single1 = SingleObject.getInstance();
        SingleObject single2 = SingleObject.getInstance();
        LogUtils.info("single1 = %s", single1.toString());
        LogUtils.info("single2 = %s", single2.toString());

        // lazily initialized singleton
        LazyLoaded lazyLoaded1 =
                LazyLoaded.getInstance();
        LazyLoaded lazyLoaded2 =
                LazyLoaded.getInstance();
        LogUtils.info("lazyLoaded1 = %s", lazyLoaded1.toString());
        LogUtils.info("lazyLoaded2 = %s", lazyLoaded2.toString());

        ThreadSafeLazyLoaded threadSafeLazyLoaded1 = ThreadSafeLazyLoaded.getInstance();
        ThreadSafeLazyLoaded threadSafeLazyLoaded2 = ThreadSafeLazyLoaded.getInstance();
        LogUtils.info("threadSafeLazyLoaded1 = %s", threadSafeLazyLoaded1.toString());
        LogUtils.info("threadSafeLazyLoaded2 = %s", threadSafeLazyLoaded2.toString());

        // enum singleton
        EnumSingleObject enumSingle1 = EnumSingleObject.INSTANCE;
        EnumSingleObject enumSingle2 = EnumSingleObject.INSTANCE;
        LogUtils.info("enumSingle1 = %s", enumSingle1.toString());
        LogUtils.info("enumSingle2 = %s", enumSingle2.toString());

        // double checked locking
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        LogUtils.info("threadSafeDoubleCheckLocking1 = %s", threadSafeDoubleCheckLocking1.toString());
        LogUtils.info("threadSafeDoubleCheckLocking2 = %s", threadSafeDoubleCheckLocking2.toString());
    }
}
