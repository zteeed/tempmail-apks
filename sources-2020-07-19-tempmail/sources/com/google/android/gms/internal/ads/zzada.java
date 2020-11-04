package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzada extends zzadk {
    private static final int j = Color.rgb(12, 174, 206);
    private static final int k = Color.rgb(204, 204, 204);
    private static final int l = j;

    /* renamed from: b  reason: collision with root package name */
    private final String f5622b;

    /* renamed from: c  reason: collision with root package name */
    private final List<zzadf> f5623c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<zzadt> f5624d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final int f5625e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5626f;
    private final int g;
    private final int h;
    private final int i;

    public zzada(String str, List<zzadf> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f5622b = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzadf zzadf = list.get(i4);
                this.f5623c.add(zzadf);
                this.f5624d.add(zzadf);
            }
        }
        this.f5625e = num != null ? num.intValue() : k;
        this.f5626f = num2 != null ? num2.intValue() : l;
        this.g = num3 != null ? num3.intValue() : 12;
        this.h = i2;
        this.i = i3;
    }

    public final int A6() {
        return this.f5625e;
    }

    public final int B6() {
        return this.f5626f;
    }

    public final int C6() {
        return this.g;
    }

    public final List<zzadf> D6() {
        return this.f5623c;
    }

    public final int E6() {
        return this.h;
    }

    public final int F6() {
        return this.i;
    }

    public final String H0() {
        return this.f5622b;
    }

    public final List<zzadt> v6() {
        return this.f5624d;
    }
}
