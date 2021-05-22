package com.cinus.business.filterchain.filter;

import com.cinus.business.filterchain.Filter;

public class LoggingFilter implements Filter {

    @Override
    public String filterName() {
        return "LoggingFilter";
    }

    @Override
    public void doFilter(String request) {
        System.out.println("request log: " + request);
    }
}
