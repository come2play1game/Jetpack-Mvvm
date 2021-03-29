package com.zs.zs_jetpack

import android.content.Context
import androidx.multidex.MultiDex
import com.didichuxing.doraemonkit.DoraemonKit
import com.scwang.smartrefresh.header.MaterialHeader
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.footer.BallPulseFooter
import com.zs.base_library.BaseApp


/**
 * @author zs
 * @data 2020/6/26
 */
class App: BaseApp() {

    override fun onCreate() {
        super.onCreate()
        initSmartHead()
        MultiDex.install(this);
        DoraemonKit.install(this, linkedMapOf(), "9b3835184c8e24d8d9f2ba98b4ca5773");

    }

    /**
     * 初始化加载刷新ui
     */
    private fun initSmartHead() {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context: Context?, _: RefreshLayout? ->
            MaterialHeader(context)
        }
        SmartRefreshLayout.setDefaultRefreshFooterCreator { context: Context?, _: RefreshLayout? ->
            BallPulseFooter(context)
        }
    }
}