package cn.tellsea.web;

import cn.tellsea.bean.User;
import cn.tellsea.dto.ResponseResult;
import cn.tellsea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public ResponseResult insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @PostMapping("/update")
    public ResponseResult update(@RequestBody User user) {
        return userService.updateByPrimaryKey(user);
    }

    @PostMapping("/delete")
    public ResponseResult delete(@RequestParam("id") Integer id) {
        return userService.deleteByPrimaryKey(id);
    }

    @PostMapping("/deleteByIds")
    public ResponseResult deleteByIds(@RequestParam("ids") String ids) {
        return userService.deleteByIds(ids);
    }

    @GetMapping("/get/{id}")
    public ResponseResult get(@PathVariable("id") Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    @GetMapping("/list")
    public String getData(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
                          @RequestParam(value = "limit",defaultValue = "10") Integer limit,
                          @RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "email", required = false) String email,
                          @RequestParam(value = "address", required = false) String address) {
        return userService.selectByPage(offset, limit, name, email, address);
    }
}