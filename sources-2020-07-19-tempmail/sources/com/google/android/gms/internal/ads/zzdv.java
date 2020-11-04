package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdv implements zzdw {
    protected static volatile zzex u;

    /* renamed from: b  reason: collision with root package name */
    protected MotionEvent f8414b;

    /* renamed from: c  reason: collision with root package name */
    protected LinkedList<MotionEvent> f8415c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    protected long f8416d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected long f8417e = 0;

    /* renamed from: f  reason: collision with root package name */
    protected long f8418f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    protected double k;
    private double l;
    private double m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    private boolean r = false;
    protected boolean s = false;
    protected DisplayMetrics t;

    protected zzdv(Context context) {
        try {
            if (((Boolean) zzwg.e().c(zzaav.h1)).booleanValue()) {
                bq.f();
            } else {
                ha0.a(u);
            }
            this.t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String c(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        String str2;
        zzdu zzdu;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context2 = context;
        int i7 = i2;
        View view2 = view;
        Activity activity2 = activity;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.X0)).booleanValue();
        zzcf.zza.C0074zza zza = null;
        if (booleanValue) {
            zzdu = u != null ? u.w() : null;
            str2 = ((Boolean) zzwg.e().c(zzaav.h1)).booleanValue() ? "be" : "te";
        } else {
            zzdu = null;
            str2 = null;
        }
        try {
            if (i7 == zzcw.f7626f) {
                zza = d(context2, view2, activity2);
                this.r = true;
                i6 = 1002;
            } else if (i7 == zzcw.f7625e) {
                zza = g(context2, view2, activity2);
                i6 = 1008;
            } else {
                zza = b(context2, (zzby.zza) null);
                i6 = 1000;
            }
            if (booleanValue && zzdu != null) {
                zzdu.c(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e2) {
            Exception exc = e2;
            if (booleanValue && zzdu != null) {
                if (i7 == zzcw.f7626f) {
                    i5 = 1003;
                } else if (i7 == zzcw.f7625e) {
                    i5 = 1009;
                } else {
                    i5 = i7 == zzcw.f7624d ? 1001 : -1;
                }
                zzdu.d(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (zza != null) {
            try {
                if (((zzcf.zza) ((zzegb) zza.O())).f() != 0) {
                    String h2 = bq.h((zzcf.zza) ((zzegb) zza.O()), str);
                    if (!booleanValue || zzdu == null) {
                        return h2;
                    }
                    if (i7 == zzcw.f7626f) {
                        i4 = 1006;
                    } else if (i7 == zzcw.f7625e) {
                        i4 = 1010;
                    } else {
                        i4 = i7 == zzcw.f7624d ? 1004 : -1;
                    }
                    zzdu.c(i4, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return h2;
                }
            } catch (Exception e3) {
                Exception exc2 = e3;
                String num = Integer.toString(7);
                if (!booleanValue || zzdu == null) {
                    return num;
                }
                if (i7 == zzcw.f7626f) {
                    i3 = 1007;
                } else if (i7 == zzcw.f7625e) {
                    i3 = 1011;
                } else {
                    i3 = i7 == zzcw.f7624d ? 1005 : -1;
                }
                zzdu.d(i3, -1, System.currentTimeMillis() - currentTimeMillis2, str2, exc2);
                return num;
            }
        }
        return Integer.toString(5);
    }

    private final void f() {
        this.h = 0;
        this.f8416d = 0;
        this.f8417e = 0;
        this.f8418f = 0;
        this.g = 0;
        this.i = 0;
        this.j = 0;
        if (this.f8415c.size() > 0) {
            Iterator it = this.f8415c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f8415c.clear();
        } else {
            MotionEvent motionEvent = this.f8414b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f8414b = null;
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr) throws zzeu;

    /* access modifiers changed from: protected */
    public abstract zzcf.zza.C0074zza b(Context context, zzby.zza zza);

    /* access modifiers changed from: protected */
    public abstract zzcf.zza.C0074zza d(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract zzfd e(MotionEvent motionEvent) throws zzeu;

    /* access modifiers changed from: protected */
    public abstract zzcf.zza.C0074zza g(Context context, View view, Activity activity);

    public String zza(Context context, View view, Activity activity) {
        return c(context, (String) null, zzcw.f7625e, view, activity, (byte[]) null);
    }

    public String zzb(Context context) {
        if (zzfg.a()) {
            if (((Boolean) zzwg.e().c(zzaav.j1)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return c(context, (String) null, zzcw.f7624d, (View) null, (Activity) null, (byte[]) null);
    }

    public void zzb(View view) {
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public String zza(Context context, String str, View view, Activity activity) {
        return c(context, str, zzcw.f7626f, view, activity, (byte[]) null);
    }

    public void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.r) {
            f();
            this.r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.l = (double) motionEvent.getRawX();
            this.m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = rawX - this.l;
            double d3 = rawY - this.m;
            this.k += Math.sqrt((d2 * d2) + (d3 * d3));
            this.l = rawX;
            this.m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.f8416d++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f8414b = obtain;
            this.f8415c.add(obtain);
            if (this.f8415c.size() > 6) {
                this.f8415c.remove().recycle();
            }
            this.f8418f++;
            this.h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f8417e += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzfd e2 = e(motionEvent);
                if ((e2 == null || e2.f8680e == null || e2.h == null) ? false : true) {
                    this.i += e2.f8680e.longValue() + e2.h.longValue();
                }
                if (!(this.t == null || e2 == null || e2.f8681f == null || e2.i == null)) {
                    z = true;
                }
                if (z) {
                    this.j += e2.f8681f.longValue() + e2.i.longValue();
                }
            } catch (zzeu unused) {
            }
        } else if (action2 == 3) {
            this.g++;
        }
        this.s = true;
    }

    public void zza(int i2, int i3, int i4) {
        if (this.f8414b != null) {
            if (((Boolean) zzwg.e().c(zzaav.V0)).booleanValue()) {
                f();
            } else {
                this.f8414b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.t;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            this.f8414b = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * f2, ((float) i3) * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f8414b = null;
        }
        this.s = false;
    }
}
