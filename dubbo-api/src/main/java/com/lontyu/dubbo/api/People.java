package com.lontyu.dubbo.api;

import java.io.Serializable;

/**
 * @description:
 * @author: xiaoZongjin
 * @create: 2019-09-20
 */
public class People implements Serializable{

    private static final long serialVersionUID = -1219706543311875990L;

    private Integer id;

    private String name;

    public People() {
    }

    public People(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}