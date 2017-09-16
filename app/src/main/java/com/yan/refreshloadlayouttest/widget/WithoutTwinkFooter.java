package com.yan.refreshloadlayouttest.widget;

import android.content.Context;
import android.view.View;

import com.yan.pullrefreshlayout.PullRefreshLayout;

/**
 * Created by yan on 2017/9/16.
 * 本库的特色就是回弹，如果你想只有一边可以回弹，可以参照这个footer在onPullChange中还原移动位置
 * <p>
 * 不能向上回弹的footer
 */

public class WithoutTwinkFooter extends View implements PullRefreshLayout.OnPullListener {
    private PullRefreshLayout pullRefreshLayout;

    public WithoutTwinkFooter(Context context, PullRefreshLayout pullRefreshLayout) {
        super(context);
        this.pullRefreshLayout = pullRefreshLayout;
    }

    @Override
    public void onPullChange(float percent) {
        if (percent < 0) {
            pullRefreshLayout.moveChildren(0);
        }
    }

    @Override
    public void onPullHoldTrigger() {

    }

    @Override
    public void onPullHoldUnTrigger() {

    }

    @Override
    public void onPullHolding() {

    }

    @Override
    public void onPullFinish() {

    }

    @Override
    public void onPullReset() {

    }
}