package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class u0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11246a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11247b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11248c;

    u0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f11246a = firebaseInstanceId;
        this.f11247b = str;
        this.f11248c = str2;
    }

    public final Object then(Task task) {
        return this.f11246a.f(this.f11247b, this.f11248c, task);
    }
}
