package com.google.android.gms.internal.ads;

import a.e.g;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccv {
    public static final zzccv h = new zzccx().b();

    /* renamed from: a  reason: collision with root package name */
    private final zzaeu f6849a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaet f6850b;

    /* renamed from: c  reason: collision with root package name */
    private final zzafi f6851c;

    /* renamed from: d  reason: collision with root package name */
    private final zzafh f6852d;

    /* renamed from: e  reason: collision with root package name */
    private final zzaiw f6853e;

    /* renamed from: f  reason: collision with root package name */
    private final g<String, zzafa> f6854f;
    private final g<String, zzaez> g;

    private zzccv(zzccx zzccx) {
        this.f6849a = zzccx.f6856a;
        this.f6850b = zzccx.f6857b;
        this.f6851c = zzccx.f6858c;
        this.f6854f = new g<>(zzccx.f6861f);
        this.g = new g<>(zzccx.g);
        this.f6852d = zzccx.f6859d;
        this.f6853e = zzccx.f6860e;
    }

    public final zzaeu a() {
        return this.f6849a;
    }

    public final zzaet b() {
        return this.f6850b;
    }

    public final zzafi c() {
        return this.f6851c;
    }

    public final zzafh d() {
        return this.f6852d;
    }

    public final zzaiw e() {
        return this.f6853e;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f6851c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f6849a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f6850b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f6854f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f6853e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f6854f.size());
        for (int i = 0; i < this.f6854f.size(); i++) {
            arrayList.add(this.f6854f.i(i));
        }
        return arrayList;
    }

    public final zzafa h(String str) {
        return this.f6854f.get(str);
    }

    public final zzaez i(String str) {
        return this.g.get(str);
    }
}
