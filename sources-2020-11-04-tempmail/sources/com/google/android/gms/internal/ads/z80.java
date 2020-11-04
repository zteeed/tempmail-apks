package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
abstract class z80 {
    z80() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public final boolean c(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract String d(byte[] bArr, int i, int i2) throws zzegl;
}
