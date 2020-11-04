package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbb {

    /* renamed from: a  reason: collision with root package name */
    private final int f6127a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzu> f6128b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6129c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f6130d;

    public zzbb(int i, List<zzu> list) {
        this(i, list, -1, (InputStream) null);
    }

    public final InputStream a() {
        return this.f6130d;
    }

    public final int b() {
        return this.f6129c;
    }

    public final int c() {
        return this.f6127a;
    }

    public final List<zzu> d() {
        return Collections.unmodifiableList(this.f6128b);
    }

    public zzbb(int i, List<zzu> list, int i2, InputStream inputStream) {
        this.f6127a = i;
        this.f6128b = list;
        this.f6129c = i2;
        this.f6130d = inputStream;
    }
}
