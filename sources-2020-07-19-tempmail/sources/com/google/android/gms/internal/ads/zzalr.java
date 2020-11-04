package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzalr {
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private static final zzazj<zzaju> f5774b = new e2();
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private static final zzazj<zzaju> f5775c = new f2();

    /* renamed from: a  reason: collision with root package name */
    private final zzakh f5776a;

    public zzalr(Context context, zzbbd zzbbd, String str) {
        this.f5776a = new zzakh(context, zzbbd, str, f5774b, f5775c);
    }

    public final <I, O> zzalj<I, O> a(String str, zzalk<I> zzalk, zzall<O> zzall) {
        return new zzals(this.f5776a, str, zzalk, zzall);
    }

    public final zzalw b() {
        return new zzalw(this.f5776a);
    }
}
