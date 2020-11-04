package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class b implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final f f11991a;

    private b(f fVar) {
        this.f11991a = fVar;
    }

    public static Continuation a(f fVar) {
        return new b(fVar);
    }

    public Object then(Task task) {
        return Boolean.valueOf(this.f11991a.o(task));
    }
}
