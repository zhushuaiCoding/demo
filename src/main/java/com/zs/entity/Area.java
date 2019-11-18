package com.zs.entity;

import java.util.Date;

/**
* 区域
*
* @author zhushuai
* 创建日期 2019/10/23
* @since
*/
public class Area {
    
    /**区域id*/
    private Long areaId;
    /**区域名字*/
    private String areaName;
    /**描述*/
    private String areaDesc;
    /**权重*/
    private Integer priority;
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date lastEditTime;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
