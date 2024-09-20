package com.ujiuye.member.dao;

import com.ujiuye.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 14:41:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
