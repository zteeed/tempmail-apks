package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class w2 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    static final ThreadFactory f11445b = new w2();

    private w2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
