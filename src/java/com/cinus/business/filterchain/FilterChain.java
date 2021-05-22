package com.cinus.business.filterchain;

import java.util.LinkedList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new LinkedList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter(String request) {
        for (Filter filter : filters) {
            filter.doFilter(request);
        }
    }
}
