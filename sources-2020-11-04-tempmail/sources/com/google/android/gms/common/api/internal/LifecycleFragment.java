package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    void e(String str, LifecycleCallback lifecycleCallback);

    @KeepForSdk
    <T extends LifecycleCallback> T m(String str, Class<T> cls);

    @KeepForSdk
    Activity n();

    @KeepForSdk
    void startActivityForResult(Intent intent, int i);
}
