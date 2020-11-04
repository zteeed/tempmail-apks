package com.google.android.gms.common.api;

import a.e.a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final a<zai<?>, ConnectionResult> f2683b;

    public AvailabilityException(a<zai<?>, ConnectionResult> aVar) {
        this.f2683b = aVar;
    }

    public ConnectionResult a(GoogleApi<? extends Api.ApiOptions> googleApi) {
        zai<? extends Api.ApiOptions> j = googleApi.j();
        Preconditions.b(this.f2683b.get(j) != null, "The given API was not part of the availability request.");
        return this.f2683b.get(j);
    }

    public final a<zai<?>, ConnectionResult> b() {
        return this.f2683b;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (zai next : this.f2683b.keySet()) {
            ConnectionResult connectionResult = this.f2683b.get(next);
            if (connectionResult.G()) {
                z = false;
            }
            String c2 = next.c();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(c2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
