package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wg implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<zzcbk> f5418a;

    private wg(zzcbk zzcbk) {
        this.f5418a = new WeakReference<>(zzcbk);
    }

    public final void a(Object obj, Map<String, String> map) {
        zzcbk zzcbk = (zzcbk) this.f5418a.get();
        if (zzcbk != null) {
            zzcbk.g.onAdImpression();
        }
    }
}
