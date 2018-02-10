package com.jikon.basePackage;

/**
 * Created by shoung on 2018/1/30.
 */
public class PageVo<T> {


    /**
     * 默认页码
     */
    public static final int DEFAULT_PAGE_NO = 1;
    /**
     * 默认页面大小
     */
    public static final int DEFAULT_PAGE_SIZE = 10;


    private  T data;


    /**
     * 开始记录行
     */
    private int begin;

    /**
     * 结尾记录行
     */
    private int end;

    private int pageNo=DEFAULT_PAGE_NO;

    private int pageSize=DEFAULT_PAGE_SIZE;

    /**
     * 页数
     */
    private int pageCount;

    /**
     * 总条数
     */
    private int totalCount;



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.pageCount=this.totalCount%this.pageSize==0?this.totalCount%this.pageSize:this.totalCount%this.pageSize+1;
    }

    public PageVo(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.begin=(this.pageNo-1)*this.pageSize;
        this.end=this.begin+this.pageSize;
    }

    public PageVo() {
        this.begin=(this.pageNo-1)*this.pageSize;
        this.end=this.begin+this.pageSize;
    }
}
