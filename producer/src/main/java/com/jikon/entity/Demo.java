package com.jikon.entity;

public class Demo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wm_demo.id
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wm_demo.name
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wm_demo.id
     *
     * @return the value of wm_demo.id
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wm_demo.id
     *
     * @param id the value for wm_demo.id
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wm_demo.name
     *
     * @return the value of wm_demo.name
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wm_demo.name
     *
     * @param name the value for wm_demo.name
     *
     * @mbggenerated Tue Jan 30 16:21:50 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}