package me.yummykang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:32
 */
public class Launcher {
    private static Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("   。。。系统启动中。。。               ");
        SystemDetails.printDetails();

        getLocalip();
        logger.info("开始初始化core服务");
        BeanFactoryUtil.init();
    }

    /**
     * 取得本机ip地址 注意：Spring RmiServiceExporter取得本机ip的方法：InetAddress.getLocalHost()
     */
    private static void getLocalip() {
        try {
            System.out.println("服务暴露的ip: "
                    + java.net.InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
