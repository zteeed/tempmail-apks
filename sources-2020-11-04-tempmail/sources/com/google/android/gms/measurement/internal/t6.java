package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class t6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ComponentName f10442b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10443c;

    t6(zzji zzji, ComponentName componentName) {
        this.f10443c = zzji;
        this.f10442b = componentName;
    }

    public final void run() {
        this.f10443c.f10680c.F(this.f10442b);
    }
}
