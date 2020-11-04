package com.google.android.gms.internal.ads;

import a.e.g;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccv {
    public static final zzccv h = new zzccx().b();

    /* renamed from: a  reason: collision with root package name */
    private final zzaeu f7032a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaet f7033b;

    /* renamed from: c  reason: collision with root package name */
    private final zzafi f7034c;

    /* renamed from: d  reason: collision with root package name */
    private final zzafh f7035d;

    /* renamed from: e  reason: collision with root package name */
    private final zzaiw f7036e;

    /* renamed from: f  reason: collision with root package name */
    private final g<String, zzafa> f7037f;
    private final g<String, zzaez> g;

    private zzccv(zzccx zzccx) {
        this.f7032a = zzccx.f7039a;
        this.f7033b = zzccx.f7040b;
        this.f7034c = zzccx.f7041c;
        this.f7037f = new g<>(zzccx.f7044f);
        this.g = new g<>(zzccx.g);
        this.f7035d = zzccx.f7042d;
        this.f7036e = zzccx.f7043e;
    }

    public final zzaeu a() {
        return this.f7032a;
    }

    public final zzaet b() {
        return this.f7033b;
    }

    public final zzafi c() {
        return this.f7034c;
    }

    public final zzafh d() {
        return this.f7035d;
    }

    public final zzaiw e() {
        return this.f7036e;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f7034c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f7032a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f7033b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f7037f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f7036e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f7037f.size());
        for (int i = 0; i < this.f7037f.size(); i++) {
            arrayList.add(this.f7037f.i(i));
        }
        return arrayList;
    }

    public final zzafa h(String str) {
        return this.f7037f.get(str);
    }

    public final zzaez i(String str) {
        return this.g.get(str);
    }
}
