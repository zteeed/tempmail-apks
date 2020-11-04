package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczw implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzvo f7761a;

    public zzczw(zzvo zzvo) {
        this.f7761a = zzvo;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzvo zzvo = this.f7761a;
        if (zzvo != null) {
            int i = zzvo.f9199b;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
