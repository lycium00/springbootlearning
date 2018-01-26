package learning.webservice.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {

    //从yml/properties配置文件注入变量
    @Value("${config.configtest}")
    private String configtest;

    public String getConfigtest() {
        System.out.println(configtest);
        return configtest;
    }
}
