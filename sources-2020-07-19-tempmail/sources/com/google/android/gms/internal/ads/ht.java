package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ht implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdec f3991b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3992c;

    ht(zzdec zzdec, long j) {
        this.f3991b = zzdec;
        this.f3992c = j;
    }

    public final void run() {
        zzdec zzdec = this.f3991b;
        long j = this.f3992c;
        String canonicalName = zzdec.getClass().getCanonicalName();
        long b2 = zzq.zzld().b() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b2);
        zzaxv.m(sb.toString());
    }
}
