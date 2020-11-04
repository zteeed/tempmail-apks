package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzey {

    /* renamed from: a  reason: collision with root package name */
    public String f10596a;

    /* renamed from: b  reason: collision with root package name */
    private String f10597b;

    /* renamed from: c  reason: collision with root package name */
    private long f10598c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f10599d;

    private zzey(String str, String str2, Bundle bundle, long j) {
        this.f10596a = str;
        this.f10597b = str2;
        this.f10599d = bundle == null ? new Bundle() : bundle;
        this.f10598c = j;
    }

    public static zzey b(zzao zzao) {
        return new zzey(zzao.f10563b, zzao.f10565d, zzao.f10564c.B(), zzao.f10566e);
    }

    public final zzao a() {
        return new zzao(this.f10596a, new zzan(new Bundle(this.f10599d)), this.f10597b, this.f10598c);
    }

    public final String toString() {
        String str = this.f10597b;
        String str2 = this.f10596a;
        String valueOf = String.valueOf(this.f10599d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
