package com.enjoy.infoService.impl;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Activate;
import com.enjoy.service.InfoService;

public class InfoServiceBImpl implements InfoService {

    @Override
    public Object sayHello(String name) {
        System.out.println(name+",你好，调通了B实现！");
        return name+",你好，调通了B实现！";
    }

    @Override
    public Object passInfo(String msg, URL url) {
        System.out.println("恭喜你，调通了B实现");
        return msg;
    }

}
