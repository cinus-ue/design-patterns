package com.cinus.business.plugin;

import java.io.File;

public class FtpStoragePlugin extends StoragePlugin {
    @Override
    public String getName() {
        return "FTP STORAGE";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public Integer getOrder() {
        return 2;
    }

    @Override
    public String getUrl(String path) {
        return "";
    }

    @Override
    public void upload(String path, File file, String contentType) {
        try {
            // TODO Upload File
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
