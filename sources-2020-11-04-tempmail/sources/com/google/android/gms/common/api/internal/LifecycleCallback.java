package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected final LifecycleFragment f2942b;

    @KeepForSdk
    protected LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f2942b = lifecycleFragment;
    }

    @KeepForSdk
    public static LifecycleFragment c(Activity activity) {
        return d(new LifecycleActivity(activity));
    }

    @KeepForSdk
    protected static LifecycleFragment d(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.c()) {
            return zzc.o2(lifecycleActivity.b());
        }
        if (lifecycleActivity.d()) {
            return zza.b(lifecycleActivity.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    public Activity b() {
        return this.f2942b.n();
    }

    @KeepForSdk
    public void e(int i, int i2, Intent intent) {
    }

    @KeepForSdk
    public void f(Bundle bundle) {
    }

    @KeepForSdk
    public void g() {
    }

    @KeepForSdk
    public void h() {
    }

    @KeepForSdk
    public void i(Bundle bundle) {
    }

    @KeepForSdk
    public void j() {
    }

    @KeepForSdk
    public void k() {
    }
}
