package com.ujiuye.context.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ujiuye.context.entity.BannerEntity;
import com.ujiuye.context.service.BannerService;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.common.utils.R;



/**
 * 内容-横幅广告表
 *
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 11:55:24
 */
@RestController
@RequestMapping("context/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("context:banner:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bannerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("context:banner:info")
    public R info(@PathVariable("id") Long id){
		BannerEntity banner = bannerService.getById(id);

        return R.ok().put("banner", banner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("context:banner:save")
    public R save(@RequestBody BannerEntity banner){
		bannerService.save(banner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("context:banner:update")
    public R update(@RequestBody BannerEntity banner){
		bannerService.updateById(banner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("context:banner:delete")
    public R delete(@RequestBody Long[] ids){
		bannerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
