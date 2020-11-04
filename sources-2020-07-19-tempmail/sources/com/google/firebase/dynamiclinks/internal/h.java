package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.a.a;
import com.google.firebase.e.b;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
final class h extends g {

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<b> f11100b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11101c;

    public h(a aVar, TaskCompletionSource<b> taskCompletionSource) {
        this.f11101c = aVar;
        this.f11100b = taskCompletionSource;
    }

    public final void l2(Status status, DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        TaskUtil.a(status, dynamicLinkData == null ? null : new b(dynamicLinkData), this.f11100b);
        if (dynamicLinkData != null && (bundle = dynamicLinkData.J().getBundle("scionData")) != null && bundle.keySet() != null && this.f11101c != null) {
            for (String str : bundle.keySet()) {
                this.f11101c.Q("fdl", str, bundle.getBundle(str));
            }
        }
    }
}
