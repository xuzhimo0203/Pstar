package com.star.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息列表控制器
 * @author star
 * @version 1.0
 * @DateTime 2023/6/5 10:42
 */
@RestController
public class UserTableController {
    @GetMapping("/table/list")
    public Map<String, Object> userTableList() {
        return new HashMap<>();
    }
}
