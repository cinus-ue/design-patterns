package com.cinus.business.filterchain;

public interface Filter {

    String filterName();

    void doFilter(String request);

}
