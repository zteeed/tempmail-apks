package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fj<T> implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<T> f3811a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3812b;

    /* renamed from: c  reason: collision with root package name */
    private final zzahc<T> f3813c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzcgr f3814d;

    private fj(zzcgr zzcgr, WeakReference<T> weakReference, String str, zzahc<T> zzahc) {
        this.f3814d = zzcgr;
        this.f3811a = weakReference;
        this.f3812b = str;
        this.f3813c = zzahc;
    }

    public final void a(Object obj, Map<String, String> map) {
        Object obj2 = this.f3811a.get();
        if (obj2 == null) {
            this.f3814d.h(this.f3812b, this);
        } else {
            this.f3813c.a(obj2, map);
        }
    }

    /* synthetic */ fj(zzcgr zzcgr, WeakReference weakReference, String str, zzahc zzahc, xi xiVar) {
        this(zzcgr, weakReference, str, zzahc);
    }
}
