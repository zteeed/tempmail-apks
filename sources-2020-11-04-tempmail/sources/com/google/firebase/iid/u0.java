package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class u0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11796a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11797b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11798c;

    u0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f11796a = firebaseInstanceId;
        this.f11797b = str;
        this.f11798c = str2;
    }

    public final Object then(Task task) {
        return this.f11796a.f(this.f11797b, this.f11798c, task);
    }
}
