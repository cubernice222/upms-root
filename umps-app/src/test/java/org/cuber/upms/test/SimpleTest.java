package org.cuber.upms.test;

import io.vertx.core.json.JsonObject;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.zookeeper.ZookeeperClusterManager;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test(){
        JsonObject zkConfig = new JsonObject();
        String zkHosts = "101.132.113.199:2181,101.132.113.199:2182,101.132.113.199:2183";
        zkConfig.put("zookeeperHosts", zkHosts);
        zkConfig.put("rootPath", "io.vertx");
        zkConfig.put("retry", new JsonObject()
                .put("initialSleepTime", 3000)
                .put("maxTimes", 3));

        ClusterManager clusterManager = new ZookeeperClusterManager(zkConfig);



    }


}
