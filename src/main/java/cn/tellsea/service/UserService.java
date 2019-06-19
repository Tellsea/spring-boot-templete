package cn.tellsea.service;

import cn.tellsea.bean.User;
import cn.tellsea.dto.ResponseResult;

public interface UserService {

    ResponseResult insert(User user);

    ResponseResult updateByPrimaryKey(User user);

    ResponseResult deleteByPrimaryKey(Integer id);

    ResponseResult deleteByIds(String id);

    ResponseResult selectByPrimaryKey(Integer id);

    String selectByPage(Integer offset, Integer limit, String name, String email, String address);
}