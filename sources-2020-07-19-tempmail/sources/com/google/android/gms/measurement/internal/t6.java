package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class t6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ComponentName f10256b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10257c;

    t6(zzji zzji, ComponentName componentName) {
        this.f10257c = zzji;
        this.f10256b = componentName;
    }

    public final void run() {
        this.f10257c.f10494c.F(this.f10256b);
    }
}
