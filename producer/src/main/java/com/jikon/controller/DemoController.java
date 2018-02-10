package com.jikon.controller;

import com.jikon.basePackage.BaseController;
import com.jikon.basePackage.Data;
import com.jikon.basePackage.PageVo;
import com.jikon.bo.DemoBo;
import com.jikon.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by shoung on 2018/1/30.
 */
@RestController
public class DemoController extends BaseController {

    @Autowired
    private DemoBo demoBo;

    @RequestMapping("/getDemosWithPage")
    public Data<PageVo<List<Demo>>> getDemosWithPage(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize){

        return new Data<>(demoBo.getDemosWithPage(new PageVo<>(pageNo,pageSize)));
    }

}
