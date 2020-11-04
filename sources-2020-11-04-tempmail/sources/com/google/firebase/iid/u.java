package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class u implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final v f11794a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f11795b;

    u(v vVar, Pair pair) {
        this.f11794a = vVar;
        this.f11795b = pair;
    }

    public final Object then(Task task) {
        this.f11794a.a(this.f11795b, task);
        return task;
    }
}
