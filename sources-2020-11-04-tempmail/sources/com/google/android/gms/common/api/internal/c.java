package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class c implements OnCompleteListener<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f2960a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaab f2961b;

    c(zaab zaab, TaskCompletionSource taskCompletionSource) {
        this.f2961b = zaab;
        this.f2960a = taskCompletionSource;
    }

    public final void a(Task<TResult> task) {
        this.f2961b.f3021b.remove(this.f2960a);
    }
}
