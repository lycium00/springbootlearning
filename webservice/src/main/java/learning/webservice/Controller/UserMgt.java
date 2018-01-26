package learning.webservice.controller;

import learning.webservice.annotation.ClassLog;
import learning.webservice.annotation.FunctionLog;
import learning.webservice.conf.Config;
import learning.webservice.domain.usermgt.UserInfo;
import learning.webservice.service.usermgt.UsermgtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/23.
 */

@ClassLog
@RestController
public class UserMgt {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Config config;

    @Autowired
    private UsermgtService usermgtService;

    @GetMapping("/hello")
    private String hello(){
        //logger.info("test");
        System.out.println("XXXXXXXXXXXXXXXXXXX");
        return "xxxxx";
        //return config.getConfigtest();
    }

    @FunctionLog
    @PostMapping("/user")
    public UserInfo login(@RequestBody UserInfo userInfo){
        return usermgtService.login(userInfo);
    }
}
