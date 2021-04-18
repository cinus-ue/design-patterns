package com.cinus.business.plugin;

import java.io.File;

public abstract class StoragePlugin implements Comparable<StoragePlugin> {

    private PluginConfigService pluginConfigService;

    public abstract String getName();

    public abstract String getVersion();

    public abstract Integer getOrder();

    public abstract String getUrl(String path);

    public abstract void upload(String path, File file, String contentType);


    public String getId() {
        return getName() + getVersion();
    }

    public PluginConfig getPluginConfig() {
        return pluginConfigService.findByPluginId(getId());
    }

    @Override
    public int compareTo(StoragePlugin o) {
        if (o == null) {
            return 1;
        }
        return this.getOrder().compareTo(o.getOrder());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        StoragePlugin other = (StoragePlugin) obj;
        return this.getId().equals(other.getId());
    }


}
