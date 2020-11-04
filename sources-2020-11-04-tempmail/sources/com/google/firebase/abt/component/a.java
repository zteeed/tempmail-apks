package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f11541a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11542b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f11543c;

    protected a(Context context, com.google.firebase.analytics.a.a aVar) {
        this.f11542b = context;
        this.f11543c = aVar;
    }

    /* access modifiers changed from: protected */
    public b a(String str) {
        return new b(this.f11542b, this.f11543c, str);
    }

    public synchronized b b(String str) {
        if (!this.f11541a.containsKey(str)) {
            this.f11541a.put(str, a(str));
        }
        return this.f11541a.get(str);
    }
}
