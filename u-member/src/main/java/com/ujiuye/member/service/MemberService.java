package com.ujiuye.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ujiuye.common.utils.PageUtils;
import com.ujiuye.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author ujiuye
 * @email ujiuye@gmail.com
 * @date 2023-08-02 14:41:53
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

