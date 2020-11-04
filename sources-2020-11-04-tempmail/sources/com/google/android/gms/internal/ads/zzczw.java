package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tempmail.t.p;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczw implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzvo f7944a;

    public zzczw(zzvo zzvo) {
        this.f7944a = zzvo;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzvo zzvo = this.f7944a;
        if (zzvo != null) {
            int i = zzvo.f9382b;
            if (i == 1) {
                bundle.putString("avo", p.g);
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
