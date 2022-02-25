package com.luoyangwei.web3j.demo.service;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;

import java.io.IOException;

/**
 * 版本服务
 *
 * @author luoyangwei by 2022-02-25 18:34 created
 * @program web3j-demo
 */
public class Web3jVersionService {
    private final static Log LOG = LogFactory.get(Web3jVersionService.class);

    private final Web3j web3j;

    public Web3jVersionService(Web3j web3j) {
        this.web3j = web3j;
    }

    public String getVersion() {
        try {
            // 获取版本
            Web3ClientVersion clientVersion = web3j.web3ClientVersion().send();
            return clientVersion.getWeb3ClientVersion();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
