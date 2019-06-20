package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
        if ("admin".equals(employee.getUsername()) && "123".equals(employee.getPassword())) {
            return AjaxResult.me().setMsg("登陆成功");
        } else {
            return AjaxResult.me().setMsg("登陆失败");
        }
    }
    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult lget(){
        return AjaxResult.me();
    }
}
