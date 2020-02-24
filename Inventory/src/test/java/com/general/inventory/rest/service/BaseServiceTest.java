package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;


public class BaseServiceTest {

    IBaseRepository baseRepository;
    public BaseServiceTest(IBaseRepository baseRepository){
        this.baseRepository=baseRepository;
    }
}
