package com.wenc.core.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.*;

/**
 *
 * https 访问工具类
 *
 * @author tim
 * @version 1.0
 *
 *
 */
public class HTTPSClientUtil {

    private static volatile HTTPSClientUtil instance;


    private static final String DEFAULT_CHARSET = "UTF-8";

    private HttpClient httpClient;


    public HttpClient getHttpClient() {
        return httpClient;
    }

    private HTTPSClientUtil()
    {


    }

    /**
     * 获取证书client.
     * @return          返回httpClient
     */
    public HttpClient getCertifiedHttpsClient()
    {
        HttpClient httpClient = null;
        try {

            httpClient = new HTTPSCertifiedClient().init();


        }catch (Exception e) {
            e.printStackTrace();
        }

        return  httpClient;
    }


    /**
     * 获取信任client.
     * @return      返回httpClient
     */
    public  HttpClient getTrustedHttpsClent()
    {
        HttpClient httpClient = null;
        try{

            httpClient = new HTTPSTrustClient().init();

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return  httpClient;
    }


    /**
     * 注册https client
     */
    public void regCertifiedHttpsClient()
    {

        try {

            this.httpClient = new HTTPSCertifiedClient().init();


        }catch (Exception e) {
            e.printStackTrace();
        }


    }


    /**
     *注册信任的 https client
     */
    public void regTrustedHttpsClent()
    {
        try{

            this.httpClient = new HTTPSTrustClient().init();

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }


    /**
     *  获取https client 工具类实例
     *
     * @return          工具类
     */
    public static HTTPSClientUtil getInstance(){

        synchronized (HTTPSClientUtil.class) {
            if (HTTPSClientUtil.instance == null){
                instance = new HTTPSClientUtil();
            }

           if(instance.getHttpClient() == null)
           {
               instance.regTrustedHttpsClent();
           }

            return instance;
        }
    }



    public static HTTPSClientUtil getCertifiedInstance(){

        synchronized (HTTPSClientUtil.class) {
            if (HTTPSClientUtil.instance == null){
                instance = new HTTPSClientUtil();
            }

            if(instance.getHttpClient() == null)
            {
                instance.regCertifiedHttpsClient();
            }

            return instance;
        }
    }


    /**
     *
     *  post api
     * @param httpClient            https client
     * @param url                   url address
     * @param paramHeader           header part params
     * @param paramBody             form params
     * @return                      mesage object
     * @throws Exception
     */
    public static String doPost(HttpClient httpClient, String url, Map<String, String> paramHeader,
                                Map<String, String> paramBody) throws Exception {
        return doPost(httpClient, url, paramHeader, paramBody, DEFAULT_CHARSET);
    }

    /**
     *  post api
     *
     * @param httpClient            https client
     * @param url                   url address
     * @param paramHeader           header params
     * @param paramBody             body   params
     * @param charset               charset default utf-8
     * @return                      message
     * @throws Exception
     */
    public static String doPost(HttpClient httpClient, String url, Map<String, String> paramHeader,
                                Map<String, String> paramBody, String charset) throws Exception {

        String result = null;
        HttpPost httpPost = new HttpPost(url);
        setHeader(httpPost, paramHeader);
        setBody(httpPost, paramBody, charset);

        HttpResponse response = httpClient.execute(httpPost);
        if (response != null) {
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                result = EntityUtils.toString(resEntity, charset);
            }
        }

        return result;
    }


    /**
     *  get api
     *
     * @param httpClient           https client
     * @param url                   url address
     * @param paramHeader           header params
     * @param paramBody             form params
     * @return                      message
     * @throws Exception
     */
    public static String doGet(HttpClient httpClient, String url, Map<String, String> paramHeader,
                               Map<String, String> paramBody) throws Exception {
        return doGet(httpClient, url, paramHeader, paramBody, DEFAULT_CHARSET);
    }

    /**
     * 针对get带参数情况做改进。
     * @param httpClient            https client
     * @param url                   url
     * @param paramHeader           header params
     * @param paramBody             form params
     * @param charset               charset default uft-8
     * @return                      message
     * @throws Exception
     */
    public static String doGet(HttpClient httpClient, String url, Map<String, String> paramHeader,
                               Map<String, String> paramBody, String charset) throws Exception {

        String result = null;


        String paramsUrl = "";
        HttpGet httpGet = null;

        //转化带参数处理。
        paramsUrl = convertParamsUrl(paramBody,charset);

        if(paramsUrl != null)
        {
            httpGet = new HttpGet(url+"?"+paramsUrl);
        }else
        {
            httpGet = new HttpGet(url);
        }


        setHeader(httpGet, paramHeader);


        HttpResponse response = httpClient.execute(httpGet);
        if (response != null) {
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                result = EntityUtils.toString(resEntity, charset);
            }
        }

        return result;
    }

    /**
     *  set header params
     * @param request           request
     * @param paramHeader       header params map
     */
    private static void setHeader(HttpRequestBase request, Map<String, String> paramHeader) {
        // 设置Header
        if (paramHeader != null) {
            Set<String> keySet = paramHeader.keySet();
            for (String key : keySet) {
                request.addHeader(key, paramHeader.get(key));
            }
        }
    }


    /**
     *  convert form params to string
     *
     * @param paramBody         form params map
     * @param charset           charset default utf-8
     * @return                  string
     * @throws Exception
     */

    private static String convertParamsUrl(Map<String, String> paramBody, String charset) throws Exception {
        // 设置参数
        if (paramBody != null) {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Set<String> keySet = paramBody.keySet();
            for (String key : keySet) {
                list.add(new BasicNameValuePair(key, paramBody.get(key)));
            }

            if (list.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
                return EntityUtils.toString(entity);
            }
        }

        return  null;
    }

    /**
     *  set body params
     * @param httpPost          http clients
     * @param paramBody         body params map
     * @param charset           utf-8
     * @throws Exception
     */
    private static void setBody(HttpPost httpPost, Map<String, String> paramBody, String charset) throws Exception {
        // 设置参数
        if (paramBody != null) {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Set<String> keySet = paramBody.keySet();
            for (String key : keySet) {
                list.add(new BasicNameValuePair(key, paramBody.get(key)));
            }

            if (list.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
                httpPost.setEntity(entity);
            }
        }
    }





    /**
     * 调用的简单模式。
     * @param url           url address
     * @return              message
     * @throws Exception
     */
    public  String doGet(String url) throws Exception {
        try {

            if(this.httpClient == null)
            {
                throw  new Exception("httpClient is null");
            }

          return   doGet(this.httpClient,url,null,null);


        }catch (Exception ex)
        {
            throw  new Exception(ex.getMessage());
        }
    }

    /**
     * 调用的简单模式。(带参数)
     * @param url               url address
     * @param queryParams       params
     * @return                  message
     * @throws Exception
     */
    public  String doGet(String url,Map<String,String> queryParams) throws Exception {
        try {

            if(this.httpClient == null)
            {
                throw  new Exception("httpClient is null");
            }

            return   doGet(this.httpClient,url,null,queryParams);


        }catch (Exception ex)
        {
            throw  new Exception(ex.getMessage());
        }
    }


    /**
     * POST的调用
     * @param url               url address
     * @return                  message obj
     * @throws Exception
     */
    public  String doPost(String url) throws Exception {
        try{

            if(this.httpClient == null)
            {
                throw  new Exception("httpClient is null");
            }

            return doPost(this.httpClient,url,null,null);

        }catch (Exception ex)
        {
            throw  new Exception(ex.getMessage());
        }
    }

    /**
     * 带参数的提交
     * @param url                   url address
     * @param queryParams           params map
     * @return                      message
     * @throws Exception
     */
    public String doPost(String url,Map<String,String> queryParams) throws Exception {
        try{
            if(this.httpClient == null)
            {
                throw  new Exception("httpClient is null");
            }

            return doPost(this.httpClient,url,null,queryParams);

        }catch (Exception ex)
        {
            throw  new Exception(ex.getMessage());
        }
    }




    /**
     * 提交json post
     * @param url
     * @param aJsonRequest
     * @return
     * @throws Exception
     */
    public String doPostJson(String url,String aJsonRequest) throws Exception{

        Map<String,String> headMap = new HashMap<>();

        Map<String,String> bodyMap = new HashMap<>();

        String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36";


        try{
            if(this.httpClient == null)
            {
                throw  new Exception("httpClient is null");
            }

            headMap.put("Content-Type", "application/json");
            headMap.put("Accept","application/json, */*");
            headMap.put("User-Agent",userAgent);


            //bodyMap.put("param",aJsonRequest);

            return doPostJson(this.httpClient,url,headMap,aJsonRequest,DEFAULT_CHARSET);

        }catch (Exception ex)
        {
            throw  new Exception(ex.getMessage());
        }



    }


    /**
     * 设置json提交的头格式。
     *
     * @param httpClient
     * @param url
     * @param paramHeader
     * @param jsonRequest
     * @param charset
     * @return
     * @throws Exception
     */
    public static String doPostJson(HttpClient httpClient, String url, Map<String, String> paramHeader,
                                    String jsonRequest, String charset) throws Exception {

        String result = null;
        HttpPost httpPost = new HttpPost(url);
        setHeader(httpPost, paramHeader);
        setJsonBody(httpPost,jsonRequest, charset);

        HttpResponse response = httpClient.execute(httpPost);
        if (response != null) {
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                result = EntityUtils.toString(resEntity, charset);
            }
        }

        return result;
    }


    /**
     * 设置post提交json的body
     * @param httpPost
     * @param jsonRequest
     * @param charset
     * @throws Exception
     */
    private static void setJsonBody(HttpPost httpPost, String jsonRequest, String charset) throws Exception {
        // 设置参数
        if (jsonRequest != null) {

            StringEntity requestEntity = new StringEntity(jsonRequest, charset);
            requestEntity.setContentEncoding(charset);
            requestEntity.setContentType("application/json");

            httpPost.setEntity(requestEntity);

        }
    }


}


