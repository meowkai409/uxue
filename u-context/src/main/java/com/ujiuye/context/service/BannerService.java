package com.ujiuye.context.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.context.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 11:55:24
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

