package com.example.reader.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {  //发送网络请求的类
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
