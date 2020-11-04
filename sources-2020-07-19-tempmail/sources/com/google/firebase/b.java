package com.google.firebase;

import android.content.Context;
import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final c f11025a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11026b;

    private b(c cVar, Context context) {
        this.f11025a = cVar;
        this.f11026b = context;
    }

    public static a a(c cVar, Context context) {
        return new b(cVar, context);
    }

    public Object get() {
        return c.r(this.f11025a, this.f11026b);
    }
}
