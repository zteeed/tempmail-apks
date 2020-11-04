package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbb {

    /* renamed from: a  reason: collision with root package name */
    private final int f6310a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzu> f6311b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6312c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f6313d;

    public zzbb(int i, List<zzu> list) {
        this(i, list, -1, (InputStream) null);
    }

    public final InputStream a() {
        return this.f6313d;
    }

    public final int b() {
        return this.f6312c;
    }

    public final int c() {
        return this.f6310a;
    }

    public final List<zzu> d() {
        return Collections.unmodifiableList(this.f6311b);
    }

    public zzbb(int i, List<zzu> list, int i2, InputStream inputStream) {
        this.f6310a = i;
        this.f6311b = list;
        this.f6312c = i2;
        this.f6313d = inputStream;
    }
}
