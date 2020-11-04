package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzabl extends zzabm {

    /* renamed from: b  reason: collision with root package name */
    private final zze f5560b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5561c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5562d;

    public zzabl(zze zze, String str, String str2) {
        this.f5560b = zze;
        this.f5561c = str;
        this.f5562d = str2;
    }

    public final void P1(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f5560b.zzh((View) ObjectWrapper.P(iObjectWrapper));
        }
    }

    public final String f1() {
        return this.f5561c;
    }

    public final String getContent() {
        return this.f5562d;
    }

    public final void recordClick() {
        this.f5560b.zzjz();
    }

    public final void recordImpression() {
        this.f5560b.zzka();
    }
}
