package com.cinus.basic.template;

import java.util.Objects;

public class TextMsgHandler extends MsgHandler<String, String> {
    @Override
    protected String beforeHandle(String request) {
        Objects.requireNonNull(request);
        return request;
    }

    @Override
    protected String handle(String request) {
        return request.substring(request.indexOf("Content"));
    }

    @Override
    protected String afterHandle(String request, String response) {
        String from = request.substring(request.indexOf("To"), request.indexOf("Content")).replaceAll("To", "From");
        String to = request.substring(request.indexOf("From"), request.indexOf("To")).replaceAll("From", "To");
        return from + to + response;
    }
}
