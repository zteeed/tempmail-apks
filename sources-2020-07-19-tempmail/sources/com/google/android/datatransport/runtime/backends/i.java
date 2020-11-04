package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;
import javax.inject.Inject;

/* compiled from: CreationContextFactory */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2551a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2552b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2553c;

    @Inject
    i(Context context, a aVar, a aVar2) {
        this.f2551a = context;
        this.f2552b = aVar;
        this.f2553c = aVar2;
    }

    /* access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.f2551a, this.f2552b, this.f2553c, str);
    }
}
