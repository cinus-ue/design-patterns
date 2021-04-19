package com.cinus.business.plugin;

import com.cinus.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class PluginConfig {

    private String pluginId;

    private Boolean isEnabled;

    private Map<String, String> attributes = new HashMap<>();


    public String getPluginId() {
        return pluginId;
    }


    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }


    public Boolean getIsEnabled() {
        return isEnabled;
    }


    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }


    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }


    public String getAttribute(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        return getAttributes() != null ? getAttributes().get(name) : null;
    }

}
