package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    void d(String str, LifecycleCallback lifecycleCallback);

    @KeepForSdk
    <T extends LifecycleCallback> T k(String str, Class<T> cls);

    @KeepForSdk
    Activity l();

    @KeepForSdk
    void startActivityForResult(Intent intent, int i);
}
