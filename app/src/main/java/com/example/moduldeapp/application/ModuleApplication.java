package com.example.moduldeapp.application;

import android.app.Application;

/**
 * @function
 * 1.整个程序的入口
 * 2.初始化工作
 * 3.为整个应用的其他模块提供上下文
 * 在Manifest中通过name属性设置为自己的Application
 */
public class ModuleApplication extends Application {
    private static ModuleApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static ModuleApplication getInstance(){
        return mApplication;
    }
}
