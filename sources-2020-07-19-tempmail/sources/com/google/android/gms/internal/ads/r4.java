package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class r4 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzavy f4780b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4781c;

    r4(zzavy zzavy, Context context) {
        this.f4780b = zzavy;
        this.f4781c = context;
    }

    public final Object call() {
        return this.f4780b.t(this.f4781c);
    }
}
