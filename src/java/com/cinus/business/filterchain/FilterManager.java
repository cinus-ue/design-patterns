package com.cinus.business.filterchain;

public class FilterManager {

    FilterChain filterChain;

    public FilterManager() {
        filterChain = new FilterChain();
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filter(String request) {
        filterChain.doFilter(request);
    }
}
