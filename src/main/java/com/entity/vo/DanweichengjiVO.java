package com.entity.vo;

import com.entity.DanweichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 单位成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public class DanweichengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
