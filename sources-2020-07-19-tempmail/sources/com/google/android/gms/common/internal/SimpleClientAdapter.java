package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Api;

public class SimpleClientAdapter<T extends IInterface> extends GmsClient<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Api.SimpleClient<T> f3036c;

    /* access modifiers changed from: protected */
    public T createServiceInterface(IBinder iBinder) {
        return this.f3036c.createServiceInterface(iBinder);
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return this.f3036c.getServiceDescriptor();
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return this.f3036c.getStartServiceAction();
    }

    public Api.SimpleClient<T> i() {
        return this.f3036c;
    }

    /* access modifiers changed from: protected */
    public void onSetConnectState(int i, T t) {
        this.f3036c.c(i, t);
    }
}
