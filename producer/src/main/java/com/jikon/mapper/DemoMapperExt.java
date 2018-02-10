package com.jikon.mapper;

import com.jikon.basePackage.PageVo;
import com.jikon.entity.Demo;
import feign.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface DemoMapperExt extends DemoMapper {
    List<Demo> getDemoWithPage(@Param("page") PageVo<Demo> page);

    int getDemoCount();
}