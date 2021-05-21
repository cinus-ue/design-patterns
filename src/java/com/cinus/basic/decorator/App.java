package com.cinus.basic.decorator;

import com.cinus.basic.decorator.storage.LocalStorage;
import com.cinus.basic.decorator.storage.decorator.CompressDecorator;
import com.cinus.basic.decorator.storage.decorator.EncryptDecorator;

import java.io.File;

public class App {

    public static void main(String[] args) {
        LocalStorage localStorage = new LocalStorage();
        CompressDecorator compressStorage = new CompressDecorator(localStorage);
        compressStorage.save(new File("xx.jpg"));
        EncryptDecorator encryptStorage = new EncryptDecorator(localStorage);
        encryptStorage.save(new File("xx.jpg"));
    }

}
