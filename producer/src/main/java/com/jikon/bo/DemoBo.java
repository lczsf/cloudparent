package com.jikon.bo;

import com.jikon.basePackage.PageVo;
import com.jikon.entity.Demo;

import java.util.List;

/**
 * Created by shoung on 2018/1/30.
 */
public interface DemoBo {
    PageVo<List<Demo>> getDemosWithPage(PageVo<Demo> objectPageVo);
}
