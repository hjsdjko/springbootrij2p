package com.dao;

import com.entity.DanweichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanweichengjiVO;
import com.entity.view.DanweichengjiView;


/**
 * 单位成绩
 * 
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface DanweichengjiDao extends BaseMapper<DanweichengjiEntity> {
	
	List<DanweichengjiVO> selectListVO(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
	
	DanweichengjiVO selectVO(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
	
	List<DanweichengjiView> selectListView(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);

	List<DanweichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
	
	DanweichengjiView selectView(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
	

}
