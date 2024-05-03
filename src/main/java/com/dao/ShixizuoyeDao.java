package com.dao;

import com.entity.ShixizuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixizuoyeVO;
import com.entity.view.ShixizuoyeView;


/**
 * 实习作业
 * 
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface ShixizuoyeDao extends BaseMapper<ShixizuoyeEntity> {
	
	List<ShixizuoyeVO> selectListVO(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
	
	ShixizuoyeVO selectVO(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
	
	List<ShixizuoyeView> selectListView(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);

	List<ShixizuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
	
	ShixizuoyeView selectView(@Param("ew") Wrapper<ShixizuoyeEntity> wrapper);
	

}
