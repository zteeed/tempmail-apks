package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaik implements AdapterStatus {

    /* renamed from: a  reason: collision with root package name */
    private final AdapterStatus.State f5723a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5724b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5725c;

    public zzaik(AdapterStatus.State state, String str, int i) {
        this.f5723a = state;
        this.f5724b = str;
        this.f5725c = i;
    }

    public final String getDescription() {
        return this.f5724b;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.f5723a;
    }

    public final int getLatency() {
        return this.f5725c;
    }
}
