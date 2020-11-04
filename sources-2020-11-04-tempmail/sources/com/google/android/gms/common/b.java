package com.google.android.gms.common;

import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3105b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3106c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3107d;

    b(boolean z, String str, c cVar) {
        this.f3105b = z;
        this.f3106c = str;
        this.f3107d = cVar;
    }

    public final Object call() {
        return a.b(this.f3105b, this.f3106c, this.f3107d);
    }
}
