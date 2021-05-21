package com.cinus.basic.decorator.storage;

import com.cinus.basic.decorator.Storage;

import java.io.File;

public class LocalStorage implements Storage {

    @Override
    public void save(File file) {
        System.out.println(String.format("Saving %s to the local disk", file.getName()));
    }

}
