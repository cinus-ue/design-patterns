package com.cinus.business.filterchain;

public class FilterManager {

    private boolean enable = true;
    private FilterChain filterChain = new FilterChain();

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void removeFilter(String filterName) {
        filterChain.removeFilter(filterName);
    }

    public void filter(String request) {
        if (enable) {
            filterChain.doFilter(request);
        }
    }

    public void disable() {
        enable = false;
    }

}
