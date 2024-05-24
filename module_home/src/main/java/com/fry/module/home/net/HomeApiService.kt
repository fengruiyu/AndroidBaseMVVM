package com.fry.module.home.net

import com.fry.module.home.activity.Response
import retrofit2.http.GET

/**
 * Home模块的接口
 *
 * @author Qu Yunshuo
 * @since 6/4/21 5:51 PM
 */
interface HomeApiService {
    @GET("api/SimpWords")
    suspend fun getHomeData(): Response

    @GET("https://api.oioweb.cn/api/qq/getQQLevelInfo?qq=599928887")
    suspend fun getHomeData1():Object

}