package com.sizu.mingteng.my_xianglekang.rxjava;


import com.sizu.mingteng.my_xianglekang.ApiService;
import com.sizu.mingteng.my_xianglekang.App;
import com.sizu.mingteng.net.RetrofitManager;

/**
 * Created by lenovo on 2017/6/12.
 */

public class RetrofitHelper {
    //region @description API 定义相关
    public static final String BASEURL = "http://api.douban.com/";
    public static final String GanK_IO = "http://gank.io/api/";
    private static final ApiService API_SERVICE = RetrofitManager
            .getInstance(App.context)
            .newRetrofit(BASEURL)
            .create(ApiService.class);

    public static ApiService getApiService() {
        return API_SERVICE;
    }

    private static final ApiService API_GanK_IO = RetrofitManager
            .getInstance(App.context)
            .newRetrofit(GanK_IO)
            .create(ApiService.class);

    public static ApiService getGanKApiService() {
        return API_GanK_IO;
    }
}
