package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzos {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f9145a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f9146b;

    public final synchronized Map<String, String> a() {
        if (this.f9146b == null) {
            this.f9146b = Collections.unmodifiableMap(new HashMap(this.f9145a));
        }
        return this.f9146b;
    }
}
