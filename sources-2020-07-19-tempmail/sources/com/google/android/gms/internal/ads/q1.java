package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q1 implements zzahc<zzalf> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzeg f4674a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaju f4675b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbaf f4676c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzakh f4677d;

    q1(zzakh zzakh, zzeg zzeg, zzaju zzaju, zzbaf zzbaf) {
        this.f4677d = zzakh;
        this.f4674a = zzeg;
        this.f4675b = zzaju;
        this.f4676c = zzbaf;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzalf zzalf = (zzalf) obj;
        synchronized (this.f4677d.f5752a) {
            zzbba.h("JS Engine is requesting an update");
            if (this.f4677d.h == 0) {
                zzbba.h("Starting reload.");
                int unused = this.f4677d.h = 2;
                this.f4677d.c(this.f4674a);
            }
            this.f4675b.n("/requestReload", (zzahc) this.f4676c.a());
        }
    }
}
