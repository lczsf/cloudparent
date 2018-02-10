package com.jikon.bo.impl;

import com.jikon.basePackage.PageVo;
import com.jikon.bo.DemoBo;
import com.jikon.entity.Demo;
import com.jikon.mapper.DemoMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shoung on 2018/1/30.
 */
@Service
public class DemoBoImpl implements DemoBo {

    @Autowired
    private DemoMapperExt demoMapperExt;
    
    @Override
    public PageVo<List<Demo>> getDemosWithPage(PageVo<Demo> pageVo) {
        PageVo<List<Demo>> result=new PageVo<>();
        result.setData(demoMapperExt.getDemoWithPage(pageVo));
        result.setTotalCount(demoMapperExt.getDemoCount());
        return result;
    }
}
