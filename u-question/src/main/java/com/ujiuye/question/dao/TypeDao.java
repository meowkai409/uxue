package com.ujiuye.question.dao;

import com.ujiuye.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 14:50:13
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
