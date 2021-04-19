package com.cinus.business.plugin;

import java.io.File;

public class LocalStoragePlugin extends StoragePlugin {


    @Override
    public String getName() {
        return "LOCAL STORAGE";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public Integer getOrder() {
        return 1;
    }

    @Override
    public String getUrl(String path) {
        return "";
    }

    @Override
    public void upload(String path, File file, String contentType) {
        try {
            // TODO Save File
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
