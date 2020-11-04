package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class q5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10380b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Uri f10381c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10382d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10383e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ n5 f10384f;

    q5(n5 n5Var, boolean z, Uri uri, String str, String str2) {
        this.f10384f = n5Var;
        this.f10380b = z;
        this.f10381c = uri;
        this.f10382d = str;
        this.f10383e = str2;
    }

    public final void run() {
        this.f10384f.b(this.f10380b, this.f10381c, this.f10382d, this.f10383e);
    }
}
