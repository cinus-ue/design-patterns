package com.cinus.business.delegate;

import com.cinus.business.delegate.service.BusinessService;
import com.cinus.business.delegate.service.HTTPService;
import com.cinus.business.delegate.service.RPCService;

import java.util.Objects;

public class BusinessLookUp {

    public BusinessService getBusinessService(ServiceType serviceType) {
        Objects.requireNonNull(serviceType);
        switch (serviceType) {
            case RPC:
                return new RPCService();
            case HTTP:
                return new HTTPService();
            default:
                return null;
        }
    }
}
