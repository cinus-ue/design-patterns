package com.cinus.basic.template;

public abstract class MsgHandler<REQ, RES> {

    public RES processer(REQ request) {
        request = beforeHandle(request);
        RES response = handle(request);
        return afterHandle(request, response);

    }

    protected abstract REQ beforeHandle(REQ request);

    protected abstract RES handle(REQ request);

    protected abstract RES afterHandle(REQ request, RES response);

}
