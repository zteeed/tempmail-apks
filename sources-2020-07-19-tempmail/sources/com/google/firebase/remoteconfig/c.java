package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final f f11443a;

    /* renamed from: b  reason: collision with root package name */
    private final Task f11444b;

    /* renamed from: c  reason: collision with root package name */
    private final Task f11445c;

    private c(f fVar, Task task, Task task2) {
        this.f11443a = fVar;
        this.f11444b = task;
        this.f11445c = task2;
    }

    public static Continuation a(f fVar, Task task, Task task2) {
        return new c(fVar, task, task2);
    }

    public Object then(Task task) {
        return f.k(this.f11443a, this.f11444b, this.f11445c, task);
    }
}
