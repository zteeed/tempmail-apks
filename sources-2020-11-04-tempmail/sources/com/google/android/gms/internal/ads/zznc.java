package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznc implements zznb {

    /* renamed from: b  reason: collision with root package name */
    private final zznb[] f9072b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<zznb> f9073c;

    /* renamed from: d  reason: collision with root package name */
    private final zzib f9074d = new zzib();

    /* renamed from: e  reason: collision with root package name */
    private zzna f9075e;

    /* renamed from: f  reason: collision with root package name */
    private zzia f9076f;
    private Object g;
    private int h = -1;
    private zzne i;

    public zznc(zznb... zznbArr) {
        this.f9072b = zznbArr;
        this.f9073c = new ArrayList<>(Arrays.asList(zznbArr));
    }

    /* access modifiers changed from: private */
    public final void b(int i2, zzia zzia, Object obj) {
        zzne zzne;
        if (this.i == null) {
            int g2 = zzia.g();
            int i3 = 0;
            while (true) {
                if (i3 >= g2) {
                    if (this.h == -1) {
                        this.h = zzia.h();
                    } else if (zzia.h() != this.h) {
                        zzne = new zzne(1);
                    }
                    zzne = null;
                } else if (zzia.c(i3, this.f9074d, false).f8932e) {
                    zzne = new zzne(0);
                    break;
                } else {
                    i3++;
                }
            }
            this.i = zzne;
        }
        if (this.i == null) {
            this.f9073c.remove(this.f9072b[i2]);
            if (i2 == 0) {
                this.f9076f = zzia;
                this.g = obj;
            }
            if (this.f9073c.isEmpty()) {
                this.f9075e.b(this.f9076f, this.g);
            }
        }
    }

    public final zzmz a(int i2, zzoi zzoi) {
        int length = this.f9072b.length;
        zzmz[] zzmzArr = new zzmz[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzmzArr[i3] = this.f9072b[i3].a(i2, zzoi);
        }
        return new kd0(zzmzArr);
    }

    public final void c(zzhe zzhe, boolean z, zzna zzna) {
        this.f9075e = zzna;
        int i2 = 0;
        while (true) {
            zznb[] zznbArr = this.f9072b;
            if (i2 < zznbArr.length) {
                zznbArr[i2].c(zzhe, false, new ld0(this, i2));
                i2++;
            } else {
                return;
            }
        }
    }

    public final void d() throws IOException {
        zzne zzne = this.i;
        if (zzne == null) {
            for (zznb d2 : this.f9072b) {
                d2.d();
            }
            return;
        }
        throw zzne;
    }

    public final void e(zzmz zzmz) {
        kd0 kd0 = (kd0) zzmz;
        int i2 = 0;
        while (true) {
            zznb[] zznbArr = this.f9072b;
            if (i2 < zznbArr.length) {
                zznbArr[i2].e(kd0.f4390b[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        for (zznb f2 : this.f9072b) {
            f2.f();
        }
    }
}
