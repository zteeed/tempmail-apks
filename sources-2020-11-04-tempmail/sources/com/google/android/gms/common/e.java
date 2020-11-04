package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class e extends c {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakReference<byte[]> f3130d = new WeakReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f3131c = f3130d;

    e(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] V() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3131c.get();
            if (bArr == null) {
                bArr = a1();
                this.f3131c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] a1();
}
