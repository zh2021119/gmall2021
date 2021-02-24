package com.tt.gmall.manage;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class GmallManageWebApplicationTests {

    @Test
    public void Test() throws IOException, MyException {
        //获取tracker配置文件的路径
        String tracker = GmallManageWebApplication.class.getResource("/tracker.conf").getPath();
        ClientGlobal.init(tracker);
        TrackerClient trackerClient = new TrackerClient();

        //获得一个trackerServer的实例
        TrackerServer trackerServer = trackerClient.getTrackerServer();

        //通过tracker获得一个storage连接客户端
        StorageClient storageClient = new StorageClient(trackerServer,null);

        String[] uploadInfos = storageClient.upload_appender_file("D:/test.png","png",null);
        String url = "http://192.168.126.130/";
        for (String uploadInfo : uploadInfos) {
            url+="/"+uploadInfo;
        }
        System.out.println(url);
    }

}
