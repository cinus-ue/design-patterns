package com.cinus.basic.decorator.storage.decorator;

import com.cinus.basic.decorator.Storage;

import java.io.File;

public abstract class StorageDecorator implements Storage {

    private Storage storage;

    public StorageDecorator(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void save(File file) {
        storage.save(file);
    }
}
