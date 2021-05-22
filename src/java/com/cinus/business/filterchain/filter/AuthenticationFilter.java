package com.cinus.business.filterchain.filter;

import com.cinus.business.filterchain.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
