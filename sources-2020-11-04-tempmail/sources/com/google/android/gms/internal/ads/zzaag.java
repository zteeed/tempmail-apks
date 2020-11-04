package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaag<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f5701a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5702b;

    /* renamed from: c  reason: collision with root package name */
    private final T f5703c;

    private zzaag(int i, String str, T t) {
        this.f5701a = i;
        this.f5702b = str;
        this.f5703c = t;
        zzwg.d().b(this);
    }

    public static zzaag<Float> c(int i, String str, float f2) {
        return new e(1, str, Float.valueOf(f2));
    }

    public static zzaag<Integer> d(int i, String str, int i2) {
        return new c(1, str, Integer.valueOf(i2));
    }

    public static zzaag<Boolean> e(int i, String str, Boolean bool) {
        return new d(i, str, bool);
    }

    public static zzaag<String> f(int i, String str, String str2) {
        return new g(1, str, str2);
    }

    public static zzaag<String> j(int i, String str) {
        zzaag<String> f2 = f(1, str, (String) null);
        zzwg.d().d(f2);
        return f2;
    }

    public static zzaag<Long> k(int i, String str, long j) {
        return new f(1, str, Long.valueOf(j));
    }

    public final String a() {
        return this.f5702b;
    }

    public final int b() {
        return this.f5701a;
    }

    /* access modifiers changed from: protected */
    public abstract T g(SharedPreferences sharedPreferences);

    public abstract T h(Bundle bundle);

    public abstract void i(SharedPreferences.Editor editor, T t);

    /* access modifiers changed from: protected */
    public abstract T l(JSONObject jSONObject);

    public final T m() {
        return this.f5703c;
    }

    /* synthetic */ zzaag(int i, String str, Object obj, d dVar) {
        this(i, str, obj);
    }
}
