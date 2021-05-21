package com.cinus.basic.decorator.storage.decorator;

import com.cinus.basic.decorator.Storage;

import java.io.File;

public class EncryptDecorator extends StorageDecorator {

    public EncryptDecorator(Storage storage) {
        super(storage);
    }

    @Override
    public void save(File file) {
        System.out.println(String.format("Encrypt %s before storage", file.getName()));
        super.save(file);
    }
}
