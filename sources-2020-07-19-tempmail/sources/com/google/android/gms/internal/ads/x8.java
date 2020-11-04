package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class x8 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<zzor> f5288a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f5289b;

    x8() {
    }

    /* access modifiers changed from: package-private */
    public final void a(zzor zzor) {
        this.f5288a.add(zzor);
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        Iterator<zzor> it = this.f5288a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> b2 = it.next().b();
            if (b2 != null) {
                for (Map.Entry next : b2.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f5289b = Math.max(this.f5289b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f5289b;
    }
}
