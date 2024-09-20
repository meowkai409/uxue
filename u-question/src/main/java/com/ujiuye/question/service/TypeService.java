package com.ujiuye.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 14:50:13
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

