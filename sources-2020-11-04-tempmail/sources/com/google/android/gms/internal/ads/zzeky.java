package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeky<T> implements zzela<T> {

    /* renamed from: a  reason: collision with root package name */
    private zzelj<T> f8837a;

    public static <T> void a(zzelj<T> zzelj, zzelj<T> zzelj2) {
        zzelg.a(zzelj2);
        zzeky zzeky = (zzeky) zzelj;
        if (zzeky.f8837a == null) {
            zzeky.f8837a = zzelj2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T get() {
        zzelj<T> zzelj = this.f8837a;
        if (zzelj != null) {
            return zzelj.get();
        }
        throw new IllegalStateException();
    }
}