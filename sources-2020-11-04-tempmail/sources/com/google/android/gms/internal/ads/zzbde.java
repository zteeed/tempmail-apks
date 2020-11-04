package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbde {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6359a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6360b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f6361c;

    /* renamed from: d  reason: collision with root package name */
    private final zzabg f6362d;

    /* renamed from: e  reason: collision with root package name */
    private final zzabi f6363e;

    /* renamed from: f  reason: collision with root package name */
    private final zzazm f6364f;
    private final long[] g;
    private final String[] h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private zzbcm n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public zzbde(Context context, zzbbd zzbbd, String str, zzabi zzabi, zzabg zzabg) {
        zzazn zzazn = new zzazn();
        zzazn zzazn2 = zzazn;
        zzazn2.a("min_1", Double.MIN_VALUE, 1.0d);
        zzazn2.a("1_5", 1.0d, 5.0d);
        zzazn2.a("5_10", 5.0d, 10.0d);
        zzazn2.a("10_20", 10.0d, 20.0d);
        zzazn2.a("20_30", 20.0d, 30.0d);
        zzazn2.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f6364f = zzazn.e();
        this.f6359a = context;
        this.f6361c = zzbbd;
        this.f6360b = str;
        this.f6363e = zzabi;
        this.f6362d = zzabg;
        String str2 = (String) zzwg.e().c(zzaav.s);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                zzbba.d("Unable to parse frame hash target time number.", e2);
                this.g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (zzacx.f5802a.a().booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f6360b);
            bundle.putString("player", this.n.r());
            for (zzazo next : this.f6364f.c()) {
                String valueOf = String.valueOf(next.f6264a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.f6268e));
                String valueOf2 = String.valueOf(next.f6264a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f6267d));
            }
            int i2 = 0;
            while (true) {
                long[] jArr = this.g;
                if (i2 < jArr.length) {
                    String str = this.h[i2];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i2++;
                } else {
                    zzq.zzkw().l(this.f6359a, this.f6361c.f6314b, "gmob-apps", bundle, true);
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void b(zzbcm zzbcm) {
        zzabd.a(this.f6363e, this.f6362d, "vpc2");
        this.i = true;
        zzabi zzabi = this.f6363e;
        if (zzabi != null) {
            zzabi.d("vpn", zzbcm.r());
        }
        this.n = zzbcm;
    }

    public final void c(zzbcm zzbcm) {
        if (this.k && !this.l) {
            if (zzaxv.n() && !this.l) {
                zzaxv.m("VideoMetricsMixin first frame");
            }
            zzabd.a(this.f6363e, this.f6362d, "vff2");
            this.l = true;
        }
        long c2 = zzq.zzld().c();
        if (this.m && this.p && this.q != -1) {
            this.f6364f.a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c2 - this.q)));
        }
        this.p = this.m;
        this.q = c2;
        long longValue = ((Long) zzwg.e().c(zzaav.t)).longValue();
        long currentPosition = (long) zzbcm.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null || longValue <= Math.abs(currentPosition - this.g[i2])) {
                zzbcm zzbcm2 = zzbcm;
                i2++;
            } else {
                String[] strArr2 = this.h;
                int i3 = 8;
                Bitmap bitmap = zzbcm.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j2);
                        i5++;
                        j2--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", new Object[]{Long.valueOf(j3)});
                return;
            }
        }
    }

    public final void d() {
        if (this.i && !this.j) {
            zzabd.a(this.f6363e, this.f6362d, "vfr2");
            this.j = true;
        }
    }

    public final void e() {
        this.m = true;
        if (this.j && !this.k) {
            zzabd.a(this.f6363e, this.f6362d, "vfp2");
            this.k = true;
        }
    }

    public final void f() {
        this.m = false;
    }
}
