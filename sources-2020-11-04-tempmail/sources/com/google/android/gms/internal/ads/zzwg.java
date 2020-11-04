package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwg {
    private static zzwg j = new zzwg();

    /* renamed from: a  reason: collision with root package name */
    private final zzbaq f9398a;

    /* renamed from: b  reason: collision with root package name */
    private final zzvp f9399b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9400c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaam f9401d;

    /* renamed from: e  reason: collision with root package name */
    private final zzaao f9402e;

    /* renamed from: f  reason: collision with root package name */
    private final zzaar f9403f;
    private final zzbbd g;
    private final Random h;
    private final WeakHashMap<QueryInfo, String> i;

    protected zzwg() {
        this(new zzbaq(), new zzvp(new zzvc(), new zzuz(), new zzzf(), new zzafx(), new zzatu(), new zzauy(), new zzaqg(), new zzafw()), new zzaam(), new zzaao(), new zzaar(), zzbaq.z(), new zzbbd(0, 201604000, true), new Random(), new WeakHashMap());
    }

    public static zzbaq a() {
        return j.f9398a;
    }

    public static zzvp b() {
        return j.f9399b;
    }

    public static zzaao c() {
        return j.f9402e;
    }

    public static zzaam d() {
        return j.f9401d;
    }

    public static zzaar e() {
        return j.f9403f;
    }

    public static String f() {
        return j.f9400c;
    }

    public static zzbbd g() {
        return j.g;
    }

    public static Random h() {
        return j.h;
    }

    public static WeakHashMap<QueryInfo, String> i() {
        return j.i;
    }

    private zzwg(zzbaq zzbaq, zzvp zzvp, zzaam zzaam, zzaao zzaao, zzaar zzaar, String str, zzbbd zzbbd, Random random, WeakHashMap<QueryInfo, String> weakHashMap) {
        this.f9398a = zzbaq;
        this.f9399b = zzvp;
        this.f9401d = zzaam;
        this.f9402e = zzaao;
        this.f9403f = zzaar;
        this.f9400c = str;
        this.g = zzbbd;
        this.h = random;
        this.i = weakHashMap;
    }
}
