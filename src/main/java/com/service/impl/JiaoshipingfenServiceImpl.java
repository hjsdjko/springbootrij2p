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


import com.dao.JiaoshipingfenDao;
import com.entity.JiaoshipingfenEntity;
import com.service.JiaoshipingfenService;
import com.entity.vo.JiaoshipingfenVO;
import com.entity.view.JiaoshipingfenView;

@Service("jiaoshipingfenService")
public class JiaoshipingfenServiceImpl extends ServiceImpl<JiaoshipingfenDao, JiaoshipingfenEntity> implements JiaoshipingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshipingfenEntity> page = this.selectPage(
                new Query<JiaoshipingfenEntity>(params).getPage(),
                new EntityWrapper<JiaoshipingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshipingfenEntity> wrapper) {
		  Page<JiaoshipingfenView> page =new Query<JiaoshipingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshipingfenVO> selectListVO(Wrapper<JiaoshipingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshipingfenVO selectVO(Wrapper<JiaoshipingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshipingfenView> selectListView(Wrapper<JiaoshipingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshipingfenView selectView(Wrapper<JiaoshipingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
