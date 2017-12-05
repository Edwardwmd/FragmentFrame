package com.wmd.edward.fragmentframe;

import android.view.MotionEvent;

import com.wmd.edward.fragmentframe.anim.FragmentAnimator;


/**
 * 时间：2017/12/05/14：20
 * 作者：MingDe_Wu
 * 网站：https://github.com/Edwardwmd
 *
 */

public interface ISupportActivity {
    SupportActivityDelegate getSupportDelegate();

    ExtraTransaction extraTransaction();

    FragmentAnimator getFragmentAnimator();

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);

    FragmentAnimator onCreateFragmentAnimator();

    void onBackPressed();

    void onBackPressedSupport();

    boolean dispatchTouchEvent(MotionEvent ev);
}
