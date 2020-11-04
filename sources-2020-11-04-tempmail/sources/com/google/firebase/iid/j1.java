package com.google.firebase.iid;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class j1 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f11759a;

    j1(ExecutorService executorService) {
        this.f11759a = executorService;
    }

    public final Task<Integer> a(Intent intent) {
        return Tasks.c(this.f11759a, new i1(intent));
    }
}
