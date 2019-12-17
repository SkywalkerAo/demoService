package demo.dubbo.config;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import org.springframework.core.io.Resource;
import java.io.*;
import java.util.Properties;

/**
 * @author SkyWalker
 * @date 2019/10/10.
 */

public class DubboConfig extends Properties {
    public DubboConfig() {
        try {
            String path = "classpath*:dubboConfig.properties";
            Resource resource = new ClassPathResource(path);
            File file = new File(path);
            InputStream inputStream = new FileInputStream(file);
            load(new InputStreamReader(new FileInputStream(resource.getFile()), "utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
