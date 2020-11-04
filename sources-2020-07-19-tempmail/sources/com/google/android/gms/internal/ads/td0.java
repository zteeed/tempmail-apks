package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class td0 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4976b;

    td0(String str) {
        this.f4976b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f4976b);
    }
}
