package com.luoyangwei.web3j.demo;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.luoyangwei.web3j.demo.service.Web3jVersionService;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

/**
 * @author luoyangwei
 */
public class Web3jDemoMain {
    private static final Log LOG = LogFactory.get(Web3jDemoMain.class);

    private static Web3j web3j;

    public static void main(String[] args) {

        // 创建web3j服务
        web3j = Web3j.build(new HttpService(Environment.RPC_SERVER_URL));

        // 版本服务
        Web3jVersionService versionService = new Web3jVersionService(web3j);
        LOG.info("clientVersion: {}", versionService);


    }
}
