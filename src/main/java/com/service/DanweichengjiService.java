package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanweichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanweichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweichengjiView;


/**
 * 单位成绩
 *
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
public interface DanweichengjiService extends IService<DanweichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanweichengjiVO> selectListVO(Wrapper<DanweichengjiEntity> wrapper);
   	
   	DanweichengjiVO selectVO(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
   	
   	List<DanweichengjiView> selectListView(Wrapper<DanweichengjiEntity> wrapper);
   	
   	DanweichengjiView selectView(@Param("ew") Wrapper<DanweichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanweichengjiEntity> wrapper);
   	

}

