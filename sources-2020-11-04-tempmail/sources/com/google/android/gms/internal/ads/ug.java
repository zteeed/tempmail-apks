package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ug implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<zzcbk> f5250a;

    private ug(zzcbk zzcbk) {
        this.f5250a = new WeakReference<>(zzcbk);
    }

    public final void a(Object obj, Map<String, String> map) {
        zzcbk zzcbk = (zzcbk) this.f5250a.get();
        if (zzcbk != null && "_ac".equals(map.get("eventName"))) {
            zzcbk.h.onAdClicked();
        }
    }
}
