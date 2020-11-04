package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzq implements zzan {

    /* renamed from: a  reason: collision with root package name */
    private int f9014a;

    /* renamed from: b  reason: collision with root package name */
    private int f9015b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9016c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9017d;

    public zzq() {
        this(2500, 1, 1.0f);
    }

    public final void a(zzao zzao) throws zzao {
        boolean z = true;
        int i = this.f9015b + 1;
        this.f9015b = i;
        int i2 = this.f9014a;
        this.f9014a = i2 + ((int) (((float) i2) * this.f9017d));
        if (i > this.f9016c) {
            z = false;
        }
        if (!z) {
            throw zzao;
        }
    }

    public final int b() {
        return this.f9014a;
    }

    public final int c() {
        return this.f9015b;
    }

    private zzq(int i, int i2, float f2) {
        this.f9014a = 2500;
        this.f9016c = 1;
        this.f9017d = 1.0f;
    }
}
