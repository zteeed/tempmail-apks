package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrc {

    /* renamed from: a  reason: collision with root package name */
    private final zzgr f8515a;

    /* renamed from: b  reason: collision with root package name */
    private final File f8516b;

    /* renamed from: c  reason: collision with root package name */
    private final File f8517c;

    /* renamed from: d  reason: collision with root package name */
    private final File f8518d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8519e;

    public zzdrc(zzgr zzgr, File file, File file2, File file3) {
        this.f8515a = zzgr;
        this.f8516b = file;
        this.f8517c = file3;
        this.f8518d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f8515a.V();
    }

    public final zzgr b() {
        return this.f8515a;
    }

    public final File c() {
        return this.f8516b;
    }

    public final File d() {
        return this.f8517c;
    }

    public final byte[] e() {
        if (this.f8519e == null) {
            this.f8519e = zzdre.f(this.f8518d);
        }
        byte[] bArr = this.f8519e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean f(long j) {
        return this.f8515a.V() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
