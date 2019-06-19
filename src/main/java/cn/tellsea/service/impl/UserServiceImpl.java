package cn.tellsea.service.impl;

import cn.tellsea.dto.BootstrapTable;
import cn.tellsea.bean.User;
import cn.tellsea.dto.ResponseResult;
import cn.tellsea.mapper.UserMapper;
import cn.tellsea.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseResult insert(User user) {
        int count = userMapper.insert(user);
        if (count == 0) {
            return new ResponseResult(0, "新增失败");
        }
        return new ResponseResult(1, "新增成功");
    }

    @Override
    public ResponseResult updateByPrimaryKey(User user) {
        int count = userMapper.updateByPrimaryKey(user);
        if (count == 0) {
            return new ResponseResult(0, "更新失败");
        }
        return new ResponseResult(1, "更新成功");
    }

    @Override
    public ResponseResult deleteByPrimaryKey(Integer id) {
        int count = userMapper.deleteByPrimaryKey(id);
        if (count == 0) {
            return new ResponseResult(0, "该数据已删除");
        }
        return new ResponseResult(1, "删除成功");
    }

    @Override
    public ResponseResult deleteByIds(String id) {
        int count = userMapper.deleteByIds(id);
        if (count == 0) {
            return new ResponseResult(0, "没有找到该数据");
        }
        return new ResponseResult(1, "批量删除成功");
    }

    @Override
    public ResponseResult selectByPrimaryKey(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null) {
            return new ResponseResult(0, "数据为空");
        }
        return new ResponseResult(1, "查询成功", user);
    }

    @Override
    public String selectByPage(Integer offset, Integer limit, String name, String email, String address) {
        if (!StringUtils.isEmpty(name) || !StringUtils.isEmpty(email) || !StringUtils.isEmpty(address)) {
            // 如果有条件，则将分页设置从0开始，避免从非第一页关键字查询发起请求
            offset = 0;
            limit = 10;
        }
        return JSON.toJSONString(new BootstrapTable(userMapper.selectCount(null), userMapper.selectByPage(offset, limit, name, email, address)));

        /* 下面的写法有问题，采用了pagehelp，但是分页有问题
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(name)) {
            criteria.andLike("name", "%" + name + "%");
        }
        if (!StringUtils.isEmpty(email)) {
            criteria.andLike("email", "%" + email + "%");
        }
        if (!StringUtils.isEmpty(address)) {
            criteria.andLike("address", "%" + address + "%");
        }
        List<User> list = userMapper.selectByExample(example);
        return JSON.toJSONString(new BootstrapTable(userMapper.selectCount(null), list));*/
    }
}
