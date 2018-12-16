package com.baizhi.controller;


import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems")
public class EmsController {

    @Autowired
    EmsMapper emsMapper;

    @RequestMapping("/test")
    public List<Ems> test(){

        Ems ems1 = new Ems();
        ems1.setCity("北京");
        List<Ems> list = emsMapper.select(ems1);

        return list;
    }

}
