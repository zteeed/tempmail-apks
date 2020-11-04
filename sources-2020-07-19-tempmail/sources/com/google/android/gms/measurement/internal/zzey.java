package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzey {

    /* renamed from: a  reason: collision with root package name */
    public String f10410a;

    /* renamed from: b  reason: collision with root package name */
    private String f10411b;

    /* renamed from: c  reason: collision with root package name */
    private long f10412c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f10413d;

    private zzey(String str, String str2, Bundle bundle, long j) {
        this.f10410a = str;
        this.f10411b = str2;
        this.f10413d = bundle == null ? new Bundle() : bundle;
        this.f10412c = j;
    }

    public static zzey b(zzao zzao) {
        return new zzey(zzao.f10377b, zzao.f10379d, zzao.f10378c.B(), zzao.f10380e);
    }

    public final zzao a() {
        return new zzao(this.f10410a, new zzan(new Bundle(this.f10413d)), this.f10411b, this.f10412c);
    }

    public final String toString() {
        String str = this.f10411b;
        String str2 = this.f10410a;
        String valueOf = String.valueOf(this.f10413d);
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
