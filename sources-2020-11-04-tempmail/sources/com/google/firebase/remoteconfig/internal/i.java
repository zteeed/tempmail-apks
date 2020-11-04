package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final k f12043a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f12044b;

    private i(k kVar, Date date) {
        this.f12043a = kVar;
        this.f12044b = date;
    }

    public static Continuation a(k kVar, Date date) {
        return new i(kVar, date);
    }

    public Object then(Task task) {
        Task unused = this.f12043a.s(task, this.f12044b);
        return task;
    }
}
