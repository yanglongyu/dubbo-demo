package com.lontyu.dubbo.provider.service;

import com.lontyu.dubbo.api.People;
import com.lontyu.dubbo.api.inter.PeopleService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description:
 *    service 注解必须使用 dubbo 的，不然注册不成功
 * @author: xiaoZongjin
 * @create: 2019-09-20
 */
@Service(version = "0.0.1")
public class PeopleServiceImpl implements PeopleService {

    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);

    @Override
    public People getPeople(Integer id) {
        logger.info("请求id={}", id);
        return new People(id, "zhangsan");
    }
}