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
    private final zze f5743b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5744c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5745d;

    public zzabl(zze zze, String str, String str2) {
        this.f5743b = zze;
        this.f5744c = str;
        this.f5745d = str2;
    }

    public final void Y1(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f5743b.zzh((View) ObjectWrapper.V(iObjectWrapper));
        }
    }

    public final String getContent() {
        return this.f5745d;
    }

    public final String l1() {
        return this.f5744c;
    }

    public final void recordClick() {
        this.f5743b.zzjz();
    }

    public final void recordImpression() {
        this.f5743b.zzka();
    }
}
