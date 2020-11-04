package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final f f11992a;

    /* renamed from: b  reason: collision with root package name */
    private final Task f11993b;

    /* renamed from: c  reason: collision with root package name */
    private final Task f11994c;

    private c(f fVar, Task task, Task task2) {
        this.f11992a = fVar;
        this.f11993b = task;
        this.f11994c = task2;
    }

    public static Continuation a(f fVar, Task task, Task task2) {
        return new c(fVar, task, task2);
    }

    public Object then(Task task) {
        return f.k(this.f11992a, this.f11993b, this.f11994c, task);
    }
}
