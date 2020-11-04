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
    private final String f5805b;

    /* renamed from: c  reason: collision with root package name */
    private final List<zzadf> f5806c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<zzadt> f5807d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final int f5808e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5809f;
    private final int g;
    private final int h;
    private final int i;

    public zzada(String str, List<zzadf> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f5805b = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzadf zzadf = list.get(i4);
                this.f5806c.add(zzadf);
                this.f5807d.add(zzadf);
            }
        }
        this.f5808e = num != null ? num.intValue() : k;
        this.f5809f = num2 != null ? num2.intValue() : l;
        this.g = num3 != null ? num3.intValue() : 12;
        this.h = i2;
        this.i = i3;
    }

    public final String O0() {
        return this.f5805b;
    }

    public final List<zzadt> Z6() {
        return this.f5807d;
    }

    public final int f7() {
        return this.f5808e;
    }

    public final int g7() {
        return this.f5809f;
    }

    public final int h7() {
        return this.g;
    }

    public final List<zzadf> i7() {
        return this.f5806c;
    }

    public final int j7() {
        return this.h;
    }

    public final int k7() {
        return this.i;
    }
}
