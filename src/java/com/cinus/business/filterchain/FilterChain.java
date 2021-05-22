package com.cinus.business.filterchain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new LinkedList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void removeFilter(String filterName) {
        for (Iterator<Filter> iterator = filters.iterator(); iterator.hasNext(); ) {
            Filter filter = iterator.next();
            if (filter.filterName().equalsIgnoreCase(filterName)) {
                iterator.remove();
            }
        }
    }

    public void doFilter(String request) {
        for (Filter filter : filters) {
            filter.doFilter(request);
        }
    }
}
