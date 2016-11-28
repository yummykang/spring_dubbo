package me.yummykang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:37
 */
public class UserServiceConsumer {
    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        logger.info("执行结果：" + userService.login("hello", "world"));
    }
}
