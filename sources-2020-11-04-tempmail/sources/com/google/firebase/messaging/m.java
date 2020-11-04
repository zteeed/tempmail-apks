package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final /* synthetic */ class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final k f11974b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f11975c;

    /* renamed from: d  reason: collision with root package name */
    private final TaskCompletionSource f11976d;

    m(k kVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f11974b = kVar;
        this.f11975c = intent;
        this.f11976d = taskCompletionSource;
    }

    public final void run() {
        k kVar = this.f11974b;
        Intent intent = this.f11975c;
        TaskCompletionSource taskCompletionSource = this.f11976d;
        try {
            kVar.d(intent);
        } finally {
            taskCompletionSource.c(null);
        }
    }
}
