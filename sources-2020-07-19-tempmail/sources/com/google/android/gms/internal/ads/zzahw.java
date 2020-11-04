package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahw implements zzx {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile zzahp f5717a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5718b;

    public zzahw(Context context) {
        this.f5718b = context;
    }

    /* access modifiers changed from: private */
    public final void b() {
        if (this.f5717a != null) {
            this.f5717a.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzy a(zzaa<?> zzaa) throws zzao {
        zzaho u = zzaho.u(zzaa);
        long b2 = zzq.zzld().b();
        try {
            zzbbn zzbbn = new zzbbn();
            this.f5717a = new zzahp(this.f5718b, zzq.zzlk().b(), new q0(this, zzbbn), new s0(this, zzbbn));
            this.f5717a.checkAvailabilityAndConnect();
            zzdvf d2 = zzdux.d(zzdux.j(zzbbn, new p0(this, u), zzbbf.f6137a), (long) ((Integer) zzwg.e().c(zzaav.U1)).intValue(), TimeUnit.MILLISECONDS, zzbbf.f6140d);
            d2.f(new r0(this), zzbbf.f6137a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) d2.get();
            long b3 = zzq.zzld().b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b3);
            sb.append("ms");
            zzaxv.m(sb.toString());
            zzahq zzahq = (zzahq) new zzash(parcelFileDescriptor).u(zzahq.CREATOR);
            if (zzahq == null) {
                return null;
            }
            if (zzahq.f5712b) {
                throw new zzao(zzahq.f5713c);
            } else if (zzahq.f5716f.length != zzahq.g.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = zzahq.f5716f;
                    if (i >= strArr.length) {
                        return new zzy(zzahq.f5714d, zzahq.f5715e, (Map<String, String>) hashMap, zzahq.h, zzahq.i);
                    }
                    hashMap.put(strArr[i], zzahq.g[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(zzq.zzld().b() - b2);
            sb2.append("ms");
            zzaxv.m(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = zzq.zzld().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            zzaxv.m(sb3.toString());
            throw th;
        }
    }
}
