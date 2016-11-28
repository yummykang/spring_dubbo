package me.yummykang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:25
 */
public class BeanFactoryUtil {
    private static ApplicationContext ctx_producer = null;

    public final static String APP_CONTEXT_ROOT = "";
    public final static String APP_CONTEXT_PATH = APP_CONTEXT_ROOT + "spring.xml";

    public static void init() {
        if (ctx_producer == null) {
            synchronized (BeanFactoryUtil.class) {
                if (ctx_producer == null) {
                    String[] configLocations = new String[]{APP_CONTEXT_PATH};
                    ctx_producer = new ClassPathXmlApplicationContext(configLocations);
                }
            }
        }
    }

    public static ApplicationContext getContext() {
        init();
        return ctx_producer;
    }
}
