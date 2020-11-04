package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fj<T> implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<T> f3994a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3995b;

    /* renamed from: c  reason: collision with root package name */
    private final zzahc<T> f3996c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzcgr f3997d;

    private fj(zzcgr zzcgr, WeakReference<T> weakReference, String str, zzahc<T> zzahc) {
        this.f3997d = zzcgr;
        this.f3994a = weakReference;
        this.f3995b = str;
        this.f3996c = zzahc;
    }

    public final void a(Object obj, Map<String, String> map) {
        Object obj2 = this.f3994a.get();
        if (obj2 == null) {
            this.f3997d.h(this.f3995b, this);
        } else {
            this.f3996c.a(obj2, map);
        }
    }

    /* synthetic */ fj(zzcgr zzcgr, WeakReference weakReference, String str, zzahc zzahc, xi xiVar) {
        this(zzcgr, weakReference, str, zzahc);
    }
}
