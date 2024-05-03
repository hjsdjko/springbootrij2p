package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 单位成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
@TableName("danweichengji")
public class DanweichengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DanweichengjiEntity() {
		
	}
	
	public DanweichengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学生学号
	 */
					
	private String xueshengxuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 工作态度
	 */
					
	private String gongzuotaidu;
	
	/**
	 * 任务完成率
	 */
					
	private String renwuwanchenglv;
	
	/**
	 * 工作积极性
	 */
					
	private String gongzuojijixing;
	
	/**
	 * 考核结果
	 */
					
	private String kaohejieguo;
	
	/**
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 提交时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tijiaoshijian;
	
	/**
	 * 工作证明
	 */
					
	private String gongzuozhengming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学生学号
	 */
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	/**
	 * 获取：学生学号
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：工作态度
	 */
	public void setGongzuotaidu(String gongzuotaidu) {
		this.gongzuotaidu = gongzuotaidu;
	}
	/**
	 * 获取：工作态度
	 */
	public String getGongzuotaidu() {
		return gongzuotaidu;
	}
	/**
	 * 设置：任务完成率
	 */
	public void setRenwuwanchenglv(String renwuwanchenglv) {
		this.renwuwanchenglv = renwuwanchenglv;
	}
	/**
	 * 获取：任务完成率
	 */
	public String getRenwuwanchenglv() {
		return renwuwanchenglv;
	}
	/**
	 * 设置：工作积极性
	 */
	public void setGongzuojijixing(String gongzuojijixing) {
		this.gongzuojijixing = gongzuojijixing;
	}
	/**
	 * 获取：工作积极性
	 */
	public String getGongzuojijixing() {
		return gongzuojijixing;
	}
	/**
	 * 设置：考核结果
	 */
	public void setKaohejieguo(String kaohejieguo) {
		this.kaohejieguo = kaohejieguo;
	}
	/**
	 * 获取：考核结果
	 */
	public String getKaohejieguo() {
		return kaohejieguo;
	}
	/**
	 * 设置：单位名称
	 */
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
	/**
	 * 设置：提交时间
	 */
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
	/**
	 * 设置：工作证明
	 */
	public void setGongzuozhengming(String gongzuozhengming) {
		this.gongzuozhengming = gongzuozhengming;
	}
	/**
	 * 获取：工作证明
	 */
	public String getGongzuozhengming() {
		return gongzuozhengming;
	}

}
