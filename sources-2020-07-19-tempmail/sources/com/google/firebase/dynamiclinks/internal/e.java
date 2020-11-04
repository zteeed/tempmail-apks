package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.c;
import com.google.firebase.e.a;
import com.google.firebase.e.b;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleApi<Api.ApiOptions.NoOptions> f11097a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f11098b;

    public e(c cVar, com.google.firebase.analytics.a.a aVar) {
        this((GoogleApi<Api.ApiOptions.NoOptions>) new c(cVar.g()), aVar);
    }

    public final Task<b> a(Intent intent) {
        Task<TResult> c2 = this.f11097a.c(new j(this.f11098b, intent.getDataString()));
        DynamicLinkData dynamicLinkData = (DynamicLinkData) SafeParcelableSerializer.b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", DynamicLinkData.CREATOR);
        b bVar = dynamicLinkData != null ? new b(dynamicLinkData) : null;
        return bVar != null ? Tasks.e(bVar) : c2;
    }

    @VisibleForTesting
    private e(GoogleApi<Api.ApiOptions.NoOptions> googleApi, com.google.firebase.analytics.a.a aVar) {
        this.f11097a = googleApi;
        this.f11098b = aVar;
        if (aVar == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
