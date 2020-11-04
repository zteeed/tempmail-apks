package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q1 implements zzahc<zzalf> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzeg f4857a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaju f4858b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbaf f4859c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzakh f4860d;

    q1(zzakh zzakh, zzeg zzeg, zzaju zzaju, zzbaf zzbaf) {
        this.f4860d = zzakh;
        this.f4857a = zzeg;
        this.f4858b = zzaju;
        this.f4859c = zzbaf;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzalf zzalf = (zzalf) obj;
        synchronized (this.f4860d.f5935a) {
            zzbba.h("JS Engine is requesting an update");
            if (this.f4860d.h == 0) {
                zzbba.h("Starting reload.");
                int unused = this.f4860d.h = 2;
                this.f4860d.c(this.f4857a);
            }
            this.f4858b.n("/requestReload", (zzahc) this.f4859c.a());
        }
    }
}
