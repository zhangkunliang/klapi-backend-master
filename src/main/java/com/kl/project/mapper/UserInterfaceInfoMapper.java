package com.kl.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.kl.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




