package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f12039a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12040b;

    private g(k kVar, long j) {
        this.f12039a = kVar;
        this.f12040b = j;
    }

    public static Continuation a(k kVar, long j) {
        return new g(kVar, j);
    }

    public Object then(Task task) {
        return this.f12039a.g(task, this.f12040b);
    }
}
