package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

public class GoogleApiAvailabilityCache {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f3012a;

    /* renamed from: b  reason: collision with root package name */
    private GoogleApiAvailabilityLight f3013b;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.q());
    }

    public void a() {
        this.f3012a.clear();
    }

    public int b(Context context, Api.Client client) {
        Preconditions.k(context);
        Preconditions.k(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i2 = this.f3012a.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f3012a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f3012a.keyAt(i3);
            if (keyAt > minApkVersion && this.f3012a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f3013b.j(context, minApkVersion);
        }
        this.f3012a.put(minApkVersion, i);
        return i;
    }

    public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f3012a = new SparseIntArray();
        Preconditions.k(googleApiAvailabilityLight);
        this.f3013b = googleApiAvailabilityLight;
    }
}
