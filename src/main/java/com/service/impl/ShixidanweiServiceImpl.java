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


import com.dao.ShixidanweiDao;
import com.entity.ShixidanweiEntity;
import com.service.ShixidanweiService;
import com.entity.vo.ShixidanweiVO;
import com.entity.view.ShixidanweiView;

@Service("shixidanweiService")
public class ShixidanweiServiceImpl extends ServiceImpl<ShixidanweiDao, ShixidanweiEntity> implements ShixidanweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixidanweiEntity> page = this.selectPage(
                new Query<ShixidanweiEntity>(params).getPage(),
                new EntityWrapper<ShixidanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixidanweiEntity> wrapper) {
		  Page<ShixidanweiView> page =new Query<ShixidanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixidanweiVO> selectListVO(Wrapper<ShixidanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixidanweiVO selectVO(Wrapper<ShixidanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixidanweiView> selectListView(Wrapper<ShixidanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixidanweiView selectView(Wrapper<ShixidanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
