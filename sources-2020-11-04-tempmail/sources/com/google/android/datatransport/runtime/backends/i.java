package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import b.c.a.b.i.x.a;
import javax.inject.Inject;

/* compiled from: CreationContextFactory */
class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2739a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2740b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2741c;

    @Inject
    i(Context context, a aVar, a aVar2) {
        this.f2739a = context;
        this.f2740b = aVar;
        this.f2741c = aVar2;
    }

    /* access modifiers changed from: package-private */
    public h a(String str) {
        return h.a(this.f2739a, this.f2740b, this.f2741c, str);
    }
}
