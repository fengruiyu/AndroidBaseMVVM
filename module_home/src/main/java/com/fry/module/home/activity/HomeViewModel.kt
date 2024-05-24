package com.fry.module.home.activity

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.fry.base.ktx.launchIO
import com.fry.base.mvvm.vm.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

/**
 * 首页的VM层
 *
 * @property mRepository HomeRepository 仓库层 通过Hilt注入
 *
 * @author Qu Yunshuo
 * @since 5/25/21 5:41 PM
 */
@HiltViewModel
class HomeViewModel @Inject constructor(private val mRepository: HomeRepository) : BaseViewModel() {
    val data = MutableLiveData<Object>()
    /**
     * 模拟获取数据
     */
   /* fun getData() {
        launchIO {
            val a = mRepository.getData()
            a.put("")
               *//* .catch { Log.d("qqq", "getData: $it") }
                .collect { data.postValue(it) }*//*
        }
    }*/

    fun getData() {
        launchIO {
           /* Log.d("qqq", "getData: ")
            val a = mRepository.mApi.getHomeData()*/
           /* mRepository.getData()
                .catch { Log.d("catch", "getData: $it") }
                .collect {Log.d("collect", "getData: $it")
                data.postValue(it)
                }*/
            mRepository.getData1()
                .catch { Log.d("catch", "getData: $it") }
                .collect {Log.d("collect", "getData: $it")
                    data.postValue(it)
                }

        }
    }
}
data class Response(
    val code: Int,
    val result: Result,
    val msg: String
)

data class Result(
    val content: String
)