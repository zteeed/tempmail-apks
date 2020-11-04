package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f11490a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11491b;

    private g(k kVar, long j) {
        this.f11490a = kVar;
        this.f11491b = j;
    }

    public static Continuation a(k kVar, long j) {
        return new g(kVar, j);
    }

    public Object then(Task task) {
        return this.f11490a.g(task, this.f11491b);
    }
}
