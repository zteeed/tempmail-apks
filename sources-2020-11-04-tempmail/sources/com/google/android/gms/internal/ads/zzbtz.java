package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtz extends zzbwv<AdMetadataListener> implements zzagi {

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6821c = new Bundle();

    public zzbtz(Set<zzbyg<AdMetadataListener>> set) {
        super(set);
    }

    public final synchronized Bundle C0() {
        return new Bundle(this.f6821c);
    }

    public final synchronized void s(String str, Bundle bundle) {
        this.f6821c.putAll(bundle);
        k0(xd.f5488a);
    }
}
