package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctu {

    /* renamed from: a  reason: collision with root package name */
    private final zzdli f7530a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcis f7531b;

    /* renamed from: c  reason: collision with root package name */
    private final zzckx f7532c;

    public zzctu(zzdli zzdli, zzcis zzcis, zzckx zzckx) {
        this.f7530a = zzdli;
        this.f7531b = zzcis;
        this.f7532c = zzckx;
    }

    public final void a(zzdkm zzdkm, zzdkk zzdkk, int i, @Nullable zzcqx zzcqx, long j) {
        zzcit zzcit;
        zzckw b2 = this.f7532c.b();
        b2.b(zzdkm);
        b2.f(zzdkk);
        b2.g("action", "adapter_status");
        b2.g("adapter_l", String.valueOf(j));
        b2.g("sc", Integer.toString(i));
        if (zzcqx != null) {
            b2.g("arec", Integer.toString(zzcqx.c()));
            String a2 = this.f7530a.a(zzcqx.getMessage());
            if (a2 != null) {
                b2.g("areec", a2);
            }
        }
        zzcis zzcis = this.f7531b;
        Iterator<String> it = zzdkk.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcit = null;
                break;
            }
            zzcit = zzcis.c(it.next());
            if (zzcit != null) {
                break;
            }
        }
        if (zzcit != null) {
            b2.g("ancn", zzcit.f7105a);
            zzapl zzapl = zzcit.f7106b;
            if (zzapl != null) {
                b2.g("adapter_v", zzapl.toString());
            }
            zzapl zzapl2 = zzcit.f7107c;
            if (zzapl2 != null) {
                b2.g("adapter_sv", zzapl2.toString());
            }
        }
        b2.d();
    }
}
