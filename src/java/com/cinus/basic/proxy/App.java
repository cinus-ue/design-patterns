package com.cinus.basic.proxy;

public class App {

    public static void main(String[] args) throws Exception {
        Proxy proxy = new Proxy();
        proxy.setAdaptee(3.14);
        System.out.println(proxy.invokeMethod("intValue"));
        System.out.println(proxy.wrap(new StringBuilder()).invokeMethod("append", "200"));
        System.out.println(proxy.invokeMethod("reverse"));
    }
}
