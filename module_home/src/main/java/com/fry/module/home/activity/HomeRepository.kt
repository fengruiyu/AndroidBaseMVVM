package com.fry.module.home.activity

import android.util.Log
import com.fry.base.mvvm.m.BaseRepository
import com.fry.module.home.net.HomeApiService
import kotlinx.coroutines.delay
import java.util.Objects
import javax.inject.Inject

/**
 * 首页M层
 *
 * @author Qu Yunshuo
 * @since 5/25/21 5:42 PM
 */
class HomeRepository @Inject constructor() : BaseRepository() {

    @Inject
    lateinit var mApi: HomeApiService

    /**
     * 模拟获取数据
     */
    suspend fun getData() = request<Response> {
        emit(mApi.getHomeData())

    }
    suspend fun getData1() = request<Object> {
        emit(mApi.getHomeData1())

    }

}
