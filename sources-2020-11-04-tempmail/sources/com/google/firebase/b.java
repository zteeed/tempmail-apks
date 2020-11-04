package com.google.firebase;

import android.content.Context;
import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final c f11575a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11576b;

    private b(c cVar, Context context) {
        this.f11575a = cVar;
        this.f11576b = context;
    }

    public static a a(c cVar, Context context) {
        return new b(cVar, context);
    }

    public Object get() {
        return c.r(this.f11575a, this.f11576b);
    }
}
