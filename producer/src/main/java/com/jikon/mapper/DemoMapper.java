package com.jikon.mapper;

import com.jikon.entity.Demo;
import com.jikon.entity.DemoExample;
import java.util.List;

public interface DemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    int countByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    int deleteByPrimaryKey(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    int insertSelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    List<Demo> selectByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    Demo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wm_demo
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    int updateByPrimaryKeySelective(Demo record);
}