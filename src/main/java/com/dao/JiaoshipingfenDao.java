package com.dao;

import com.entity.JiaoshipingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshipingfenVO;
import com.entity.view.JiaoshipingfenView;


/**
 * 教师评分
 * 
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface JiaoshipingfenDao extends BaseMapper<JiaoshipingfenEntity> {
	
	List<JiaoshipingfenVO> selectListVO(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
	
	JiaoshipingfenVO selectVO(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
	
	List<JiaoshipingfenView> selectListView(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);

	List<JiaoshipingfenView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
	
	JiaoshipingfenView selectView(@Param("ew") Wrapper<JiaoshipingfenEntity> wrapper);
	

}
