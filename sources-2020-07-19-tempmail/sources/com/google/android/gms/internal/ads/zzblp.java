package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblp {

    /* renamed from: a  reason: collision with root package name */
    private final String f6332a;

    /* renamed from: b  reason: collision with root package name */
    private final zzalw f6333b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f6334c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public zzblu f6335d;

    /* renamed from: e  reason: collision with root package name */
    private final zzahc<Object> f6336e = new yb(this);

    /* renamed from: f  reason: collision with root package name */
    private final zzahc<Object> f6337f = new zb(this);

    public zzblp(String str, zzalw zzalw, Executor executor) {
        this.f6332a = str;
        this.f6333b = zzalw;
        this.f6334c = executor;
    }

    /* access modifiers changed from: private */
    public final boolean h(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f6332a)) {
            return false;
        }
        return true;
    }

    public final void b(zzblu zzblu) {
        this.f6333b.b("/updateActiveView", this.f6336e);
        this.f6333b.b("/untrackActiveViewUnit", this.f6337f);
        this.f6335d = zzblu;
    }

    public final void d() {
        this.f6333b.c("/updateActiveView", this.f6336e);
        this.f6333b.c("/untrackActiveViewUnit", this.f6337f);
    }

    public final void f(zzbfn zzbfn) {
        zzbfn.c("/updateActiveView", this.f6336e);
        zzbfn.c("/untrackActiveViewUnit", this.f6337f);
    }

    public final void g(zzbfn zzbfn) {
        zzbfn.n("/updateActiveView", this.f6336e);
        zzbfn.n("/untrackActiveViewUnit", this.f6337f);
    }
}
