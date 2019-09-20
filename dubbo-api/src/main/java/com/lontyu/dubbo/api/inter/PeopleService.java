package com.lontyu.dubbo.api.inter;

import com.lontyu.dubbo.api.People;

/**
 * @description:  暴露出去的api 接口
 * @author: xiaoZongjin
 * @create: 2019-09-20
 */
public interface PeopleService {

    People getPeople(Integer id);
}
