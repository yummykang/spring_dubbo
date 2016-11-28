package me.yummykang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:19
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public boolean login(String username, String password) {
        logger.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }
}
