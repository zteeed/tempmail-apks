package com.google.firebase.iid;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class j1 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f11209a;

    j1(ExecutorService executorService) {
        this.f11209a = executorService;
    }

    public final Task<Integer> a(Intent intent) {
        return Tasks.c(this.f11209a, new i1(intent));
    }
}
