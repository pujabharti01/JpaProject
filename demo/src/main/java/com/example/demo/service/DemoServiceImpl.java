package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.InitBinder;

import com.example.demo.dto.DemoDto;

@Service
public class DemoServiceImpl implements DemoService {

    

    @Override
    public DemoDto getName() {
    	DemoDto var = new DemoDto();
        var.setName("Puja");
        var.setAge(23);
        var.setHeight(5l);
        return var;
    }
}
