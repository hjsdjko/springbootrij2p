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


import com.dao.ShixizuoyeDao;
import com.entity.ShixizuoyeEntity;
import com.service.ShixizuoyeService;
import com.entity.vo.ShixizuoyeVO;
import com.entity.view.ShixizuoyeView;

@Service("shixizuoyeService")
public class ShixizuoyeServiceImpl extends ServiceImpl<ShixizuoyeDao, ShixizuoyeEntity> implements ShixizuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixizuoyeEntity> page = this.selectPage(
                new Query<ShixizuoyeEntity>(params).getPage(),
                new EntityWrapper<ShixizuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixizuoyeEntity> wrapper) {
		  Page<ShixizuoyeView> page =new Query<ShixizuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixizuoyeVO> selectListVO(Wrapper<ShixizuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixizuoyeVO selectVO(Wrapper<ShixizuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixizuoyeView> selectListView(Wrapper<ShixizuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixizuoyeView selectView(Wrapper<ShixizuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
