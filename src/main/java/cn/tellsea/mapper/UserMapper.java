package cn.tellsea.mapper;

import cn.tellsea.bean.User;
import cn.tellsea.base.mapper.MyMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

    @Select("SELECT * FROM tb_user WHERE name LIKE '%${name}%' AND email LIKE '%${email}%' AND address LIKE '%${address}%' LIMIT ${offset}, ${limit}")
    List<User> selectByPage(Integer offset, Integer limit, String name, String email, String address);
}
