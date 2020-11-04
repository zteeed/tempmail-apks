package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

final class i extends p {

    /* renamed from: c  reason: collision with root package name */
    private final Map<Api.Client, h> f2977c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zaak f2978d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(zaak zaak, Map<Api.Client, h> map) {
        super(zaak, (g) null);
        this.f2978d = zaak;
        this.f2977c = map;
    }

    @GuardedBy("mLock")
    public final void a() {
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.f2978d.f3028d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client next : this.f2977c.keySet()) {
            if (!next.requiresGooglePlayServices() || this.f2977c.get(next).f2976c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = googleApiAvailabilityCache.b(this.f2978d.f3027c, (Api.Client) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = googleApiAvailabilityCache.b(this.f2978d.f3027c, (Api.Client) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f2978d.f3025a.d(new j(this, this.f2978d, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.f2978d.m && this.f2978d.k != null) {
            this.f2978d.k.connect();
        }
        for (Api.Client next2 : this.f2977c.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = this.f2977c.get(next2);
            if (!next2.requiresGooglePlayServices() || googleApiAvailabilityCache.b(this.f2978d.f3027c, next2) == 0) {
                next2.connect(connectionProgressReportCallbacks);
            } else {
                this.f2978d.f3025a.d(new k(this, this.f2978d, connectionProgressReportCallbacks));
            }
        }
    }
}
