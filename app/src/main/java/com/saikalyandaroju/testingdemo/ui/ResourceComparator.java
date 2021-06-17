package com.saikalyandaroju.testingdemo.ui;

import android.content.Context;

public class ResourceComparator {

    public boolean isEqual(Context context, int resId, String typed) {
        return context.getResources().getString(resId).equals(typed);
    }

}
