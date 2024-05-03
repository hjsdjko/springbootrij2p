package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshipingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshipingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshipingfenView;


/**
 * 教师评分
 *
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface JiaoshipingfenService extends IService<JiaoshipingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshipingfenVO> selectListVO(Wrapper<JiaoshipingfenEntity> wrapper);
   	
   	JiaoshipingfenVO selectVO(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
   	
   	List<JiaoshipingfenView> selectListView(Wrapper<JiaoshipingfenEntity> wrapper);
   	
   	JiaoshipingfenView selectView(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshipingfenEntity> wrapper);
   	

}

