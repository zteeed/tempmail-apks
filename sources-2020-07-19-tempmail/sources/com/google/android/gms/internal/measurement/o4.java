package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
abstract class o4 {
    o4() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract String c(byte[] bArr, int i, int i2) throws zzfw;

    /* access modifiers changed from: package-private */
    public final boolean d(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }
}
