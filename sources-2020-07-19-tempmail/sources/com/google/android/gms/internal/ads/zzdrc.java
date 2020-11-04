package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrc {

    /* renamed from: a  reason: collision with root package name */
    private final zzgr f8332a;

    /* renamed from: b  reason: collision with root package name */
    private final File f8333b;

    /* renamed from: c  reason: collision with root package name */
    private final File f8334c;

    /* renamed from: d  reason: collision with root package name */
    private final File f8335d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8336e;

    public zzdrc(zzgr zzgr, File file, File file2, File file3) {
        this.f8332a = zzgr;
        this.f8333b = file;
        this.f8334c = file3;
        this.f8335d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f8332a.V();
    }

    public final zzgr b() {
        return this.f8332a;
    }

    public final File c() {
        return this.f8333b;
    }

    public final File d() {
        return this.f8334c;
    }

    public final byte[] e() {
        if (this.f8336e == null) {
            this.f8336e = zzdre.f(this.f8335d);
        }
        byte[] bArr = this.f8336e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean f(long j) {
        return this.f8332a.V() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
