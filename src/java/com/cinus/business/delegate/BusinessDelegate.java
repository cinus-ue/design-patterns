package com.cinus.business.delegate;

import com.cinus.business.delegate.service.BusinessService;

public class BusinessDelegate {
    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private BusinessService businessService;
    private ServiceType serviceType;

    public BusinessDelegate(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.processing();
    }
}
