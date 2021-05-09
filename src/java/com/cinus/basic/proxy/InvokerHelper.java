package com.cinus.basic.proxy;

public class InvokerHelper {

    public static Object invokeMethod(Object object, String methodName, Object... arguments) throws Exception {
        Class<?>[] parameterTypes = new Class[arguments.length];
        for (int i = 0; i < arguments.length; i++) {
            parameterTypes[i] = arguments[i].getClass();
        }
        if (object instanceof Class) {
            Class theClass = (Class) object;
            return theClass.getMethod(methodName, parameterTypes).invoke(object, arguments);
        } else {
            return object.getClass().getMethod(methodName, parameterTypes).invoke(object, arguments);
        }
    }

}
