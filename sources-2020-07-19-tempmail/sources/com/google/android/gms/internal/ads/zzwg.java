package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwg {
    private static zzwg j = new zzwg();

    /* renamed from: a  reason: collision with root package name */
    private final zzbaq f9215a;

    /* renamed from: b  reason: collision with root package name */
    private final zzvp f9216b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9217c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaam f9218d;

    /* renamed from: e  reason: collision with root package name */
    private final zzaao f9219e;

    /* renamed from: f  reason: collision with root package name */
    private final zzaar f9220f;
    private final zzbbd g;
    private final Random h;
    private final WeakHashMap<QueryInfo, String> i;

    protected zzwg() {
        this(new zzbaq(), new zzvp(new zzvc(), new zzuz(), new zzzf(), new zzafx(), new zzatu(), new zzauy(), new zzaqg(), new zzafw()), new zzaam(), new zzaao(), new zzaar(), zzbaq.z(), new zzbbd(0, 201604000, true), new Random(), new WeakHashMap());
    }

    public static zzbaq a() {
        return j.f9215a;
    }

    public static zzvp b() {
        return j.f9216b;
    }

    public static zzaao c() {
        return j.f9219e;
    }

    public static zzaam d() {
        return j.f9218d;
    }

    public static zzaar e() {
        return j.f9220f;
    }

    public static String f() {
        return j.f9217c;
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
        this.f9215a = zzbaq;
        this.f9216b = zzvp;
        this.f9218d = zzaam;
        this.f9219e = zzaao;
        this.f9220f = zzaar;
        this.f9217c = str;
        this.g = zzbbd;
        this.h = random;
        this.i = weakHashMap;
    }
}
