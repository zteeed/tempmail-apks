package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ht implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdec f4174b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4175c;

    ht(zzdec zzdec, long j) {
        this.f4174b = zzdec;
        this.f4175c = j;
    }

    public final void run() {
        zzdec zzdec = this.f4174b;
        long j = this.f4175c;
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
