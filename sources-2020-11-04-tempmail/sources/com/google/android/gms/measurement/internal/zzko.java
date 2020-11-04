package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzko {

    /* renamed from: a  reason: collision with root package name */
    final Context f10699a;

    @VisibleForTesting
    public zzko(Context context) {
        Preconditions.k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.k(applicationContext);
        this.f10699a = applicationContext;
    }
}
