package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final /* synthetic */ class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final k f11425b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f11426c;

    /* renamed from: d  reason: collision with root package name */
    private final TaskCompletionSource f11427d;

    m(k kVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f11425b = kVar;
        this.f11426c = intent;
        this.f11427d = taskCompletionSource;
    }

    public final void run() {
        k kVar = this.f11425b;
        Intent intent = this.f11426c;
        TaskCompletionSource taskCompletionSource = this.f11427d;
        try {
            kVar.d(intent);
        } finally {
            taskCompletionSource.c(null);
        }
    }
}
