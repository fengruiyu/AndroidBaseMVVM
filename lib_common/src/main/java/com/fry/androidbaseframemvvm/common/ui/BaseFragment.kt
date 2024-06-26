package com.fry.androidbaseframemvvm.common.ui

import androidx.viewbinding.ViewBinding
import com.fry.base.mvvm.v.BaseFrameFragment
import com.fry.base.mvvm.vm.BaseViewModel

/**
 * Fragment基类
 *
 * @author Qu Yunshuo
 * @since 8/27/20
 */
abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel> : BaseFrameFragment<VB, VM>()