package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzgl<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f8882a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f8882a.containsKey(str)) {
                this.f8882a.put(str, new AtomicReference());
            }
        }
        return this.f8882a.get(str);
    }
}
