package com.cinus.basic.decorator.storage.decorator;

import com.cinus.basic.decorator.Storage;

import java.io.File;

public class CompressDecorator extends StorageDecorator {

    public CompressDecorator(Storage storage) {
        super(storage);
    }

    @Override
    public void save(File file) {
        System.out.println(String.format("Compress %s before storage", file.getName()));
        super.save(file);
    }
}
