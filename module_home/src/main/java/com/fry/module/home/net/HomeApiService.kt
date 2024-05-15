package com.fry.module.home.net

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Home模块的接口
 *
 * @author Qu Yunshuo
 * @since 6/4/21 5:51 PM
 */
interface HomeApiService {
    @GET("home/data")
    suspend fun getHomeData(@Query("userId") userId: String): String
}