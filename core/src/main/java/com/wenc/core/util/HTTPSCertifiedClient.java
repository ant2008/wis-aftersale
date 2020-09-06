package com.wenc.core.util;


import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

/**
 * @author tim
 * @version  1.0
 *
 * @see org.apache.http.impl.client.HttpClientBuilder
 */
public class HTTPSCertifiedClient extends HTTPSClient {

    public HTTPSCertifiedClient() {

    }

    @Override
    public void prepareCertificate() throws Exception {
        // 获得密匙库
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        FileInputStream instream = new FileInputStream(
                new File("C:/Users/zhda6001/Downloads/software/xxx.keystore"));
        // FileInputStream instream = new FileInputStream(new File("C:/Users/zhda6001/Downloads/xxx.keystore"));
        try {
            // 密匙库的密码
            trustStore.load(instream, "password".toCharArray());
        } finally {
            instream.close();
        }

        SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(trustStore, TrustSelfSignedStrategy.INSTANCE)
                .build();
        this.connectionSocketFactory = new SSLConnectionSocketFactory(sslcontext);
    }

}

