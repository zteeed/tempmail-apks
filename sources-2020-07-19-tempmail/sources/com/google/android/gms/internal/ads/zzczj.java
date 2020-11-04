package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczj implements zzdec<zzczk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdec<zzdef> f7737a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdla f7738b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7739c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxh f7740d;

    public zzczj(zzday<zzdef> zzday, zzdla zzdla, Context context, zzaxh zzaxh) {
        this.f7737a = zzday;
        this.f7738b = zzdla;
        this.f7739c = context;
        this.f7740d = zzaxh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzczk a(zzdef zzdef) {
        boolean z;
        String str;
        int i;
        int i2;
        float f2;
        String str2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzvh zzvh = this.f7738b.f8167e;
        zzvh[] zzvhArr = zzvh.h;
        if (zzvhArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzvh zzvh2 : zzvhArr) {
                if (!zzvh2.j && !z2) {
                    str = zzvh2.f9189b;
                    z2 = true;
                }
                if (zzvh2.j && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzvh.f9189b;
            z = zzvh.j;
        }
        Resources resources = this.f7739c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f2 = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f3 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f7740d.r().v();
            i2 = i6;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        zzvh[] zzvhArr2 = zzvh.h;
        if (zzvhArr2 != null) {
            boolean z4 = false;
            for (zzvh zzvh3 : zzvhArr2) {
                if (zzvh3.j) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzvh3.f9193f != -1 || f2 == 0.0f) {
                        i4 = zzvh3.f9193f;
                    } else {
                        i4 = (int) (((float) zzvh3.g) / f2);
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzvh3.f9190c == -2) {
                        if (f2 != 0.0f) {
                            i5 = (int) (((float) zzvh3.f9191d) / f2);
                            sb.append(i5);
                        }
                    }
                    i5 = zzvh3.f9190c;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzczk(zzvh, str, z, sb.toString(), f2, i2, i, str2, this.f7738b.o);
    }

    public final zzdvf<zzczk> b() {
        return zzdux.i(this.f7737a.b(), new ir(this), zzbbf.f6142f);
    }
}
