package com.cinus.business.delegate;

import com.cinus.business.delegate.service.BusinessService;

public class BusinessDelegate {
    private ServiceLookup serviceLookUp = new ServiceLookup();
    private BusinessService businessService;
    private ServiceType serviceType;

    public BusinessDelegate(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = serviceLookUp.lookupService(serviceType);
        businessService.processing();
    }
}
