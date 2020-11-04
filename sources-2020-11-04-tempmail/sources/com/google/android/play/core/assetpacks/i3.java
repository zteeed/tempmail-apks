package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.n;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class i3 implements b0<Executor> {
    public static Executor a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(x2.f11456b);
        n.c(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return a();
    }
}
