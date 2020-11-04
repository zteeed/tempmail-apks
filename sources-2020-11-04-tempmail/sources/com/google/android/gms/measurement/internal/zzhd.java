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
    final Context f10658a;

    /* renamed from: b  reason: collision with root package name */
    String f10659b;

    /* renamed from: c  reason: collision with root package name */
    String f10660c;

    /* renamed from: d  reason: collision with root package name */
    String f10661d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f10662e;

    /* renamed from: f  reason: collision with root package name */
    long f10663f;
    zzae g;
    boolean h = true;
    Long i;

    @VisibleForTesting
    public zzhd(Context context, zzae zzae, Long l) {
        Preconditions.k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.k(applicationContext);
        this.f10658a = applicationContext;
        this.i = l;
        if (zzae != null) {
            this.g = zzae;
            this.f10659b = zzae.g;
            this.f10660c = zzae.f9729f;
            this.f10661d = zzae.f9728e;
            this.h = zzae.f9727d;
            this.f10663f = zzae.f9726c;
            Bundle bundle = zzae.h;
            if (bundle != null) {
                this.f10662e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
