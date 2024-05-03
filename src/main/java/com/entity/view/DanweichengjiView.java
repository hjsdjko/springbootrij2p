package com.entity.view;

import com.entity.DanweichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 单位成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
@TableName("danweichengji")
public class DanweichengjiView  extends DanweichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DanweichengjiView(){
	}
 
 	public DanweichengjiView(DanweichengjiEntity danweichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, danweichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
