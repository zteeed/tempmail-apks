package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final class n {
    static Executor a() {
        return b("Firebase-Messaging-Rpc-Task");
    }

    private static Executor b(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    static Executor c() {
        return b("Firebase-Messaging-Trigger-Topics-Io");
    }
}
