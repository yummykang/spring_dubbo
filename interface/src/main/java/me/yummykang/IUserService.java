package me.yummykang;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:15
 */
public interface IUserService {
    /**
     * 登录方法
     * @return 是否登录成功
     */
    boolean login(String username, String password);
}
