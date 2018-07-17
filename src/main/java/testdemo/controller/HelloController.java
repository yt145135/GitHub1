package testdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


//@Controller注解支持返回jsp页面，@RestController注解只能返回return中的字符串
@Controller
//@PropertySource({"classpath:config/application.properties"})
public class HelloController {

    private static Logger logger= LoggerFactory.getLogger(HelloController.class);


    @Value("${my.name}")
    private String Name;

    @RequestMapping("/index")
    public String index(Map<String,Object> map) {
        map.put("index","SpringBoot");
        map.put("Name",Name);
        return "index";
    }
    @RequestMapping("/welcome")
    public String welcome() {
        logger.debug("Spring Boot中默认配置ERROR、WARN和INFO级别的日志输出到控制台");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "second/welcome";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "加ResponseBody注解返回的是字符串";
    }
}
