package demo.dubbo.service;

import com.alibaba.fastjson.JSONObject;
import demo.dubbo.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author SkyWalker
 * @date 2019/10/15.
 */
@Service
public class DemoServiceImpl implements DemoService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ProviderService providerService;

    @Override
    public String simpleService(String s) {
        logger.info("receive:"+s);
        return Server.getServerDesc() + " receive msg: "+ s;
    }

    @Override
    public JSONObject simpleRpcService(JSONObject jsonObject) {
        String msg = providerService.serviceDesc("back call, service invoke api");
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("msg",msg);
        return jsonObj;
    }
}
