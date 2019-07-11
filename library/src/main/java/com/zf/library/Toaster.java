package com.zf.library;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class Toaster {

    public static void toaster(Context context, String content) {
        if (TextUtils.isEmpty(content)) return;
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }
}
