package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaik implements AdapterStatus {

    /* renamed from: a  reason: collision with root package name */
    private final AdapterStatus.State f5906a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5907b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5908c;

    public zzaik(AdapterStatus.State state, String str, int i) {
        this.f5906a = state;
        this.f5907b = str;
        this.f5908c = i;
    }

    public final String getDescription() {
        return this.f5907b;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.f5906a;
    }

    public final int getLatency() {
        return this.f5908c;
    }
}
