package com.dao;

import com.entity.ShixidanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixidanweiVO;
import com.entity.view.ShixidanweiView;


/**
 * 实习单位
 * 
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface ShixidanweiDao extends BaseMapper<ShixidanweiEntity> {
	
	List<ShixidanweiVO> selectListVO(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
	
	ShixidanweiVO selectVO(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
	
	List<ShixidanweiView> selectListView(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);

	List<ShixidanweiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
	
	ShixidanweiView selectView(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
	

}
