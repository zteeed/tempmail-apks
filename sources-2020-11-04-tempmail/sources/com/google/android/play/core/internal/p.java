package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public abstract class p implements Closeable {
    public abstract long a();

    /* access modifiers changed from: protected */
    public abstract InputStream b(long j, long j2) throws IOException;

    public synchronized InputStream d() throws IOException {
        return b(0, a());
    }
}
