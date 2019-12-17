package demo.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author SkyWalker
 * @date 2019/10/9.
 */
public class Starter {
    private static Logger logger = LoggerFactory.getLogger(Starter.class);
    public static void main(String[] args) throws Exception {
        logger.info("service start...");
        com.alibaba.dubbo.container.Main.main(args);
    }
}
