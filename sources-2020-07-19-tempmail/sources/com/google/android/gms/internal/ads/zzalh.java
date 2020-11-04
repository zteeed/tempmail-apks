package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzalh implements zzajp, zzale {

    /* renamed from: b  reason: collision with root package name */
    private final zzalf f5765b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, zzahc<? super zzalf>>> f5766c = new HashSet<>();

    public zzalh(zzalf zzalf) {
        this.f5765b = zzalf;
    }

    public final void P() {
        Iterator<AbstractMap.SimpleEntry<String, zzahc<? super zzalf>>> it = this.f5766c.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((zzahc) next.getValue()).toString());
            zzaxv.m(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f5765b.n((String) next.getKey(), (zzahc) next.getValue());
        }
        this.f5766c.clear();
    }

    public final void a0(String str, String str2) {
        zzajo.a(this, str, str2);
    }

    public final void c(String str, zzahc<? super zzalf> zzahc) {
        this.f5765b.c(str, zzahc);
        this.f5766c.add(new AbstractMap.SimpleEntry(str, zzahc));
    }

    public final void e0(String str, JSONObject jSONObject) {
        zzajo.c(this, str, jSONObject);
    }

    public final void f(String str) {
        this.f5765b.f(str);
    }

    public final void k(String str, JSONObject jSONObject) {
        zzajo.d(this, str, jSONObject);
    }

    public final void n(String str, zzahc<? super zzalf> zzahc) {
        this.f5765b.n(str, zzahc);
        this.f5766c.remove(new AbstractMap.SimpleEntry(str, zzahc));
    }

    public final void z(String str, Map map) {
        zzajo.b(this, str, map);
    }
}
