package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzank implements MediationAdRequest {

    /* renamed from: a  reason: collision with root package name */
    private final Date f5978a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5979b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f5980c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5981d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f5982e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5983f;
    private final boolean g;

    public zzank(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f5978a = date;
        this.f5979b = i;
        this.f5980c = set;
        this.f5982e = location;
        this.f5981d = z;
        this.f5983f = i2;
        this.g = z2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f5978a;
    }

    @Deprecated
    public final int getGender() {
        return this.f5979b;
    }

    public final Set<String> getKeywords() {
        return this.f5980c;
    }

    public final Location getLocation() {
        return this.f5982e;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.g;
    }

    public final boolean isTesting() {
        return this.f5981d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f5983f;
    }
}
