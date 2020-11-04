package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgl<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f8699a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f8699a.containsKey(str)) {
                this.f8699a.put(str, new AtomicReference());
            }
        }
        return this.f8699a.get(str);
    }
}
