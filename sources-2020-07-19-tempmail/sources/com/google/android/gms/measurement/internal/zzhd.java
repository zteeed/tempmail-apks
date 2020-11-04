package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzhd {

    /* renamed from: a  reason: collision with root package name */
    final Context f10472a;

    /* renamed from: b  reason: collision with root package name */
    String f10473b;

    /* renamed from: c  reason: collision with root package name */
    String f10474c;

    /* renamed from: d  reason: collision with root package name */
    String f10475d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f10476e;

    /* renamed from: f  reason: collision with root package name */
    long f10477f;
    zzae g;
    boolean h = true;
    Long i;

    @VisibleForTesting
    public zzhd(Context context, zzae zzae, Long l) {
        Preconditions.k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.k(applicationContext);
        this.f10472a = applicationContext;
        this.i = l;
        if (zzae != null) {
            this.g = zzae;
            this.f10473b = zzae.g;
            this.f10474c = zzae.f9546f;
            this.f10475d = zzae.f9545e;
            this.h = zzae.f9544d;
            this.f10477f = zzae.f9543c;
            Bundle bundle = zzae.h;
            if (bundle != null) {
                this.f10476e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
