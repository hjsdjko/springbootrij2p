package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixizuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixizuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixizuoyeView;


/**
 * 实习作业
 *
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface ShixizuoyeService extends IService<ShixizuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixizuoyeVO> selectListVO(Wrapper<ShixizuoyeEntity> wrapper);
   	
   	ShixizuoyeVO selectVO(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
   	
   	List<ShixizuoyeView> selectListView(Wrapper<ShixizuoyeEntity> wrapper);
   	
   	ShixizuoyeView selectView(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixizuoyeEntity> wrapper);
   	

}

