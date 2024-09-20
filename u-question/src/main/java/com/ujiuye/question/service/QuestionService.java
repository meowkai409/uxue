package com.ujiuye.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 14:50:13
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

