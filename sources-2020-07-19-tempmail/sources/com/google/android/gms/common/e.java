package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class e extends c {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakReference<byte[]> f2942d = new WeakReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f2943c = f2942d;

    e(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] P() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f2943c.get();
            if (bArr == null) {
                bArr = U0();
                this.f2943c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] U0();
}
