package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbik implements zzela<WeakReference<Context>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbie f6271a;

    public zzbik(zzbie zzbie) {
        this.f6271a = zzbie;
    }

    public final /* synthetic */ Object get() {
        WeakReference<Context> b2 = this.f6271a.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
