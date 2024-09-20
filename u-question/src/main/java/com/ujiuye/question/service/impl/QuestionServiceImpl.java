package com.ujiuye.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.common.utils.Query;

import com.ujiuye.question.dao.QuestionDao;
import com.ujiuye.question.entity.QuestionEntity;
import com.ujiuye.question.service.QuestionService;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                new QueryWrapper<QuestionEntity>()
        );

        return new PageUtils(page);
    }

}