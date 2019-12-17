package demo.dubbo;

/**
 * @author SkyWalker
 * @date 2019/10/15.
 */
public class Server {
    private static String serverId;
    static {
        serverId = "demo.service.server";
    }

    /**
     * @return 返回服务描述信息
     */
    public static String getServerDesc(){
        return "Server: " + serverId;
    }


}
