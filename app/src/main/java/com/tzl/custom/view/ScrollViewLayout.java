package com.tzl.custom.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by tzl on 2017/12/10.
 */

public class ScrollViewLayout extends LinearLayout {
    public ScrollViewLayout(Context context) {
        this(context,null);
    }

    public ScrollViewLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ScrollViewLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    
}
