package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShixizuoyeEntity;
import com.entity.view.ShixizuoyeView;

import com.service.ShixizuoyeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实习作业
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-22 12:29:31
 */
@RestController
@RequestMapping("/shixizuoye")
public class ShixizuoyeController {
    @Autowired
    private ShixizuoyeService shixizuoyeService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShixizuoyeEntity shixizuoye,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shixidanwei")) {
			shixizuoye.setDanweimingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shixizuoye.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			shixizuoye.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShixizuoyeEntity> ew = new EntityWrapper<ShixizuoyeEntity>();
		PageUtils page = shixizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixizuoye), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShixizuoyeEntity shixizuoye, 
		HttpServletRequest request){
        EntityWrapper<ShixizuoyeEntity> ew = new EntityWrapper<ShixizuoyeEntity>();
		PageUtils page = shixizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixizuoye), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShixizuoyeEntity shixizuoye){
       	EntityWrapper<ShixizuoyeEntity> ew = new EntityWrapper<ShixizuoyeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shixizuoye, "shixizuoye")); 
        return R.ok().put("data", shixizuoyeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShixizuoyeEntity shixizuoye){
        EntityWrapper< ShixizuoyeEntity> ew = new EntityWrapper< ShixizuoyeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shixizuoye, "shixizuoye")); 
		ShixizuoyeView shixizuoyeView =  shixizuoyeService.selectView(ew);
		return R.ok("查询实习作业成功").put("data", shixizuoyeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShixizuoyeEntity shixizuoye = shixizuoyeService.selectById(id);
        return R.ok().put("data", shixizuoye);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShixizuoyeEntity shixizuoye = shixizuoyeService.selectById(id);
        return R.ok().put("data", shixizuoye);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request){
    	shixizuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixizuoye);
        shixizuoyeService.insert(shixizuoye);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request){
    	shixizuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixizuoye);
        shixizuoyeService.insert(shixizuoye);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShixizuoyeEntity shixizuoye, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shixizuoye);
        shixizuoyeService.updateById(shixizuoye);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shixizuoyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShixizuoyeEntity> wrapper = new EntityWrapper<ShixizuoyeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shixidanwei")) {
			wrapper.eq("danweimingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengxuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shixizuoyeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
