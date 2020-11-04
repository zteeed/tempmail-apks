package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblp {

    /* renamed from: a  reason: collision with root package name */
    private final String f6515a;

    /* renamed from: b  reason: collision with root package name */
    private final zzalw f6516b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f6517c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public zzblu f6518d;

    /* renamed from: e  reason: collision with root package name */
    private final zzahc<Object> f6519e = new yb(this);

    /* renamed from: f  reason: collision with root package name */
    private final zzahc<Object> f6520f = new zb(this);

    public zzblp(String str, zzalw zzalw, Executor executor) {
        this.f6515a = str;
        this.f6516b = zzalw;
        this.f6517c = executor;
    }

    /* access modifiers changed from: private */
    public final boolean h(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f6515a)) {
            return false;
        }
        return true;
    }

    public final void b(zzblu zzblu) {
        this.f6516b.b("/updateActiveView", this.f6519e);
        this.f6516b.b("/untrackActiveViewUnit", this.f6520f);
        this.f6518d = zzblu;
    }

    public final void d() {
        this.f6516b.c("/updateActiveView", this.f6519e);
        this.f6516b.c("/untrackActiveViewUnit", this.f6520f);
    }

    public final void f(zzbfn zzbfn) {
        zzbfn.c("/updateActiveView", this.f6519e);
        zzbfn.c("/untrackActiveViewUnit", this.f6520f);
    }

    public final void g(zzbfn zzbfn) {
        zzbfn.n("/updateActiveView", this.f6519e);
        zzbfn.n("/untrackActiveViewUnit", this.f6520f);
    }
}
