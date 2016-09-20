package com.weishengming.hessian.mannaservice.api.bean;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.weishengming.utils.jackson.JacksonDateDeserializer;
import com.weishengming.utils.jackson.JacksonDateTimeSerializer;

/**
 * MannaBean
 * @author yangtianci
 * @version $Id: MannaBean.java, v 0.1 2016年8月26日 上午11:00:45 yangtianci Exp $
 */
public class MannaBean implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;

    /**
     * 配置标识
     * T_Manna_Record.RecordId
     */
    private Long              recordId;

    /**
     * 类型
     * T_Manna_Record.Type
     */
    private Integer           type;

    /**
     * 配置码
     * T_Manna_Record.Code
     */
    private String            code;

    /**
     * 配置名称
     * T_Manna_Record.Name
     */
    private String            name;

    /**
     * 配置值
     * T_Manna_Record.Value
     */
    private String            value;

    /**
     * 状态
     * T_Manna_Record.Status
     */
    private Integer           status;

    /**
     * 创建时间
     * T_Manna_Record.CreateTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date              createTime;

    /**
     * 最后修改时间
     * T_Manna_Record.LastModifyTime
     */
    @JsonSerialize(using = JacksonDateTimeSerializer.class)
    @JsonDeserialize(using = JacksonDateDeserializer.class)
    private Date              lastModifyTime;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

}
