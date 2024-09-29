package com.ujiuye.question.service.impl;

import com.alibaba.druid.util.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.common.utils.Query;

import com.ujiuye.question.dao.TypeDao;
import com.ujiuye.question.entity.TypeEntity;
import com.ujiuye.question.service.TypeService;


@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeDao, TypeEntity> implements TypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //1、获取查询关键字
        String key= (String) params.get("key");
        //2、创建查询条件对象
        QueryWrapper<TypeEntity> queryWrapper = new QueryWrapper<>();
        //3、设置查询条件
        if(!StringUtils.isEmpty(key)){
            queryWrapper.eq("id",key).or().like("type",key);
        }
        IPage<TypeEntity> page = this.page(
                new Query<TypeEntity>().getPage(params),
                queryWrapper
        );
        return new PageUtils(page);
    }

}