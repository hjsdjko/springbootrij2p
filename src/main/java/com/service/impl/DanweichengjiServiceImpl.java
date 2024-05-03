package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DanweichengjiDao;
import com.entity.DanweichengjiEntity;
import com.service.DanweichengjiService;
import com.entity.vo.DanweichengjiVO;
import com.entity.view.DanweichengjiView;

@Service("danweichengjiService")
public class DanweichengjiServiceImpl extends ServiceImpl<DanweichengjiDao, DanweichengjiEntity> implements DanweichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanweichengjiEntity> page = this.selectPage(
                new Query<DanweichengjiEntity>(params).getPage(),
                new EntityWrapper<DanweichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanweichengjiEntity> wrapper) {
		  Page<DanweichengjiView> page =new Query<DanweichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanweichengjiVO> selectListVO(Wrapper<DanweichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanweichengjiVO selectVO(Wrapper<DanweichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanweichengjiView> selectListView(Wrapper<DanweichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanweichengjiView selectView(Wrapper<DanweichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
