package com.lontyu.dubbo.comsumer.controller;

import com.lontyu.dubbo.api.People;
import com.lontyu.dubbo.api.inter.PeopleService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xiaoZongjin
 * @create: 2019-09-20
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @Reference(version = "0.0.1")
    private PeopleService peopleService;

    @GetMapping("/getPeople/{id}")
    public People getPeople(@PathVariable Integer id){
        return peopleService.getPeople(id);
    }
}