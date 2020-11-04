package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class zaab {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f2832a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<TaskCompletionSource<?>, Boolean> f2833b = Collections.synchronizedMap(new WeakHashMap());

    private final void d(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f2832a) {
            hashMap = new HashMap(this.f2832a);
        }
        synchronized (this.f2833b) {
            hashMap2 = new HashMap(this.f2833b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).n(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.f2832a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.c(new b(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void c(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f2833b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.a().c(new c(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !this.f2832a.isEmpty() || !this.f2833b.isEmpty();
    }

    public final void f() {
        d(false, GoogleApiManager.o);
    }

    public final void g() {
        d(true, zacp.f2876d);
    }
}
