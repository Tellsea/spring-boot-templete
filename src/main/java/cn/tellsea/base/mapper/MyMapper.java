package cn.tellsea.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

/**
 * 自定义通用mapper需要继承的接口
 */
public interface MyMapper<T> extends Mapper<T>, DeleteByIdsMapper<T> {
}