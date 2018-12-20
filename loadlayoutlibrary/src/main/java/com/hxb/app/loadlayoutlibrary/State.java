package com.hxb.app.loadlayoutlibrary;

/**
 * @作者 ：hexingbo
 * @时间 ：2018/12/20
 * @描述 ：State  加载数据的几中状态：加载中，加载成功，加载失败，加载成功没有数据返回
 */
public interface State {
    /**
     * 加载中
     */
    int LOADING = 1;

    /**
     * 加载成功
     */
    int SUCCESS = 2;

    /**
     * 加载失败
     */
    int FAILED = 3;

    /**
     * 加载成功且返回无数据
     */
    int NO_DATA = 4;

}
