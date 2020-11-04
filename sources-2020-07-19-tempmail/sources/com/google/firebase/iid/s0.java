package com.google.firebase.iid;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f11242a = r0.f11240b;

    static Executor a() {
        return f11242a;
    }

    static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
