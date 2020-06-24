package com.jiangsl.qxglxt.controller; /*
 * @Description TODO
 * @Author jiangsl
 * @Date 2020/6/23 23:07
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello(){
        return "hello SpringBoot";
    }
}
