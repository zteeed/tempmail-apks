package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class q5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10194b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Uri f10195c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10196d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10197e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ n5 f10198f;

    q5(n5 n5Var, boolean z, Uri uri, String str, String str2) {
        this.f10198f = n5Var;
        this.f10194b = z;
        this.f10195c = uri;
        this.f10196d = str;
        this.f10197e = str2;
    }

    public final void run() {
        this.f10198f.b(this.f10194b, this.f10195c, this.f10196d, this.f10197e);
    }
}
