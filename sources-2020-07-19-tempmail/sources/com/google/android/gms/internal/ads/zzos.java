package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzos {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f8962a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f8963b;

    public final synchronized Map<String, String> a() {
        if (this.f8963b == null) {
            this.f8963b = Collections.unmodifiableMap(new HashMap(this.f8962a));
        }
        return this.f8963b;
    }
}
