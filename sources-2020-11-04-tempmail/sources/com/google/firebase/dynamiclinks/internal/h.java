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
    private final TaskCompletionSource<b> f11650b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11651c;

    public h(a aVar, TaskCompletionSource<b> taskCompletionSource) {
        this.f11651c = aVar;
        this.f11650b = taskCompletionSource;
    }

    public final void v2(Status status, DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        TaskUtil.a(status, dynamicLinkData == null ? null : new b(dynamicLinkData), this.f11650b);
        if (dynamicLinkData != null && (bundle = dynamicLinkData.J().getBundle("scionData")) != null && bundle.keySet() != null && this.f11651c != null) {
            for (String str : bundle.keySet()) {
                this.f11651c.W("fdl", str, bundle.getBundle(str));
            }
        }
    }
}
