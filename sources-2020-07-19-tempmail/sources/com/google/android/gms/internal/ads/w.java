package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class w extends zzaey {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzafz f5169b;

    private w(zzafz zzafz) {
        this.f5169b = zzafz;
    }

    public final void V(zzaep zzaep, String str) {
        if (this.f5169b.f5681b != null) {
            this.f5169b.f5681b.onCustomClick(this.f5169b.d(zzaep), str);
        }
    }
}
