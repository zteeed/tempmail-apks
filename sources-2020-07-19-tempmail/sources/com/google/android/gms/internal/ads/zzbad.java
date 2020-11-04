package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbad extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbe f6093a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6094b;

    public zzbad(Context context, String str, String str2) {
        this(str2, zzq.zzkw().m0(context, str));
    }

    public final void zzut() {
        this.f6093a.a(this.f6094b);
    }

    private zzbad(String str, String str2) {
        this.f6093a = new zzbbe(str2);
        this.f6094b = str;
    }
}
