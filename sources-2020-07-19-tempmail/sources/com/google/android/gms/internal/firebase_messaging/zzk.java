package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
public final class zzk {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9302a = Logger.getLogger(zzk.class.getName());

    private zzk() {
    }

    public static void a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                try {
                    f9302a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e2);
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            }
        }
    }
}
