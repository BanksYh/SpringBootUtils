package org.springbootUtils.controller;

import org.springbootUtils.utils.HttpContextUtils;
import org.springbootUtils.utils.IPUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @RequestMapping("/getIp")
    public String getIp(){
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        String ip = IPUtils.getIpAddr(request);
        return ip;

    }
}
