package com.trigyn.priceservice.service;



import com.trigyn.priceservice.model.Price;
import com.trigyn.priceservice.repo.Pricerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;


import java.util.ArrayList;

import java.util.List;


@Service

public class PriceService {

    List<Price> priceList = new ArrayList<>();
    @Autowired
    private Pricerepo pricerepo;

    public Boolean addPriceList(Price price){

        pricerepo.save(price);
        return true;

    }


    public List<Price> getPriceList(){

        return pricerepo.findAll();

    }

}




