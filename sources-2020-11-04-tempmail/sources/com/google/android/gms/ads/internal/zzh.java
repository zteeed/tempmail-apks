package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaav;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzwg;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzh implements zzdw, Runnable {
    private final List<Object[]> zzbos = new Vector();
    private final AtomicReference<zzdw> zzbot = new AtomicReference<>();
    private final AtomicReference<zzdw> zzbou = new AtomicReference<>();
    private zzbbd zzbov;
    private CountDownLatch zzbow = new CountDownLatch(1);
    private Context zzvr;
    private final int zzxn;

    public zzh(Context context, zzbbd zzbbd) {
        this.zzvr = context;
        this.zzbov = zzbbd;
        int intValue = ((Integer) zzwg.e().c(zzaav.U0)).intValue();
        if (intValue == 1) {
            this.zzxn = zzcw.f7805b;
        } else if (intValue != 2) {
            this.zzxn = zzcw.f7804a;
        } else {
            this.zzxn = zzcw.f7806c;
        }
        if (((Boolean) zzwg.e().c(zzaav.k1)).booleanValue()) {
            zzbbf.f6320a.execute(this);
            return;
        }
        zzwg.a();
        if (zzbaq.y()) {
            zzbbf.f6320a.execute(this);
        } else {
            run();
        }
    }

    private final zzdw zzcb() {
        if (this.zzxn == zzcw.f7805b) {
            return this.zzbou.get();
        }
        return this.zzbot.get();
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean zzkb() {
        try {
            this.zzbow.await();
            return true;
        } catch (InterruptedException e2) {
            zzbba.d("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private final void zzkc() {
        zzdw zzcb = zzcb();
        if (!this.zzbos.isEmpty() && zzcb != null) {
            for (Object[] next : this.zzbos) {
                if (next.length == 1) {
                    zzcb.zza((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    zzcb.zza(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.zzbos.clear();
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzbov.f6317e;
            if (!((Boolean) zzwg.e().c(zzaav.u0)).booleanValue() && z2) {
                z = true;
            }
            if (this.zzxn != zzcw.f7805b) {
                this.zzbot.set(zzed.s(this.zzbov.f6314b, zze(this.zzvr), z, this.zzxn));
            }
            if (this.zzxn != zzcw.f7804a) {
                this.zzbou.set(zzdp.c(this.zzbov.f6314b, zze(this.zzvr), z));
            }
        } finally {
            this.zzbow.countDown();
            this.zzvr = null;
            this.zzbov = null;
        }
    }

    public final String zza(Context context, View view, Activity activity) {
        zzdw zzcb = zzcb();
        return zzcb != null ? zzcb.zza(context, view, activity) : "";
    }

    public final String zzb(Context context) {
        zzdw zzdw;
        if (!zzkb()) {
            return "";
        }
        int i = this.zzxn;
        if (i == zzcw.f7805b || i == zzcw.f7806c) {
            zzdw = this.zzbou.get();
        } else {
            zzdw = this.zzbot.get();
        }
        if (zzdw == null) {
            return "";
        }
        zzkc();
        return zzdw.zzb(zze(context));
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        zzdw zzcb;
        if (!zzkb() || (zzcb = zzcb()) == null) {
            return "";
        }
        zzkc();
        return zzcb.zza(zze(context), str, view, activity);
    }

    public final void zzb(View view) {
        zzdw zzcb = zzcb();
        if (zzcb != null) {
            zzcb.zzb(view);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        zzdw zzcb = zzcb();
        if (zzcb != null) {
            zzkc();
            zzcb.zza(motionEvent);
            return;
        }
        this.zzbos.add(new Object[]{motionEvent});
    }

    public final void zza(int i, int i2, int i3) {
        zzdw zzcb = zzcb();
        if (zzcb != null) {
            zzkc();
            zzcb.zza(i, i2, i3);
            return;
        }
        this.zzbos.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }
}
