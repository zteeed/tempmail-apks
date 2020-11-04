package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcj implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8038a;

    public zzdcj(String str) {
        this.f8038a = str;
    }

    /* access modifiers changed from: private */
    public static boolean b(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public final /* synthetic */ void a(Object obj) {
        zzdlf.e((Bundle) obj, "omid_v", this.f8038a);
    }
}
