package com.ujiuye.context.dao;

import com.ujiuye.context.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 11:55:24
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
