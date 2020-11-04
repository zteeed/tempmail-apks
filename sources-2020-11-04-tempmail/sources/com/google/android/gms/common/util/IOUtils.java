package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@ShowFirstParty
@KeepForSdk
@Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return e(inputStream, outputStream, false);
    }

    @KeepForSdk
    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    a(inputStream);
                    a(outputStream);
                }
            }
        }
        return j;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    private static long e(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return c(inputStream, outputStream, z, 1024);
    }
}
