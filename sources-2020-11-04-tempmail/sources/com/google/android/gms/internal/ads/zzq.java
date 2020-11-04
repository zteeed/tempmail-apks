package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzq implements zzan {

    /* renamed from: a  reason: collision with root package name */
    private int f9197a;

    /* renamed from: b  reason: collision with root package name */
    private int f9198b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9199c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9200d;

    public zzq() {
        this(2500, 1, 1.0f);
    }

    public final void a(zzao zzao) throws zzao {
        boolean z = true;
        int i = this.f9198b + 1;
        this.f9198b = i;
        int i2 = this.f9197a;
        this.f9197a = i2 + ((int) (((float) i2) * this.f9200d));
        if (i > this.f9199c) {
            z = false;
        }
        if (!z) {
            throw zzao;
        }
    }

    public final int b() {
        return this.f9197a;
    }

    public final int c() {
        return this.f9198b;
    }

    private zzq(int i, int i2, float f2) {
        this.f9197a = 2500;
        this.f9199c = 1;
        this.f9200d = 1.0f;
    }
}
