package com.entity.view;

import com.entity.ShixidanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
@TableName("shixidanwei")
public class ShixidanweiView  extends ShixidanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixidanweiView(){
	}
 
 	public ShixidanweiView(ShixidanweiEntity shixidanweiEntity){
 	try {
			BeanUtils.copyProperties(this, shixidanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
