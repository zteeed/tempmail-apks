package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f10989a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f10990b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f10991c;

    protected a(Context context, com.google.firebase.analytics.a.a aVar) {
        this.f10990b = context;
        this.f10991c = aVar;
    }

    /* access modifiers changed from: protected */
    public b a(String str) {
        return new b(this.f10990b, this.f10991c, str);
    }

    public synchronized b b(String str) {
        if (!this.f10989a.containsKey(str)) {
            this.f10989a.put(str, a(str));
        }
        return this.f10989a.get(str);
    }
}
