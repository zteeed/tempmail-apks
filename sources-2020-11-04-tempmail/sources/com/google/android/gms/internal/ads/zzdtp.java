package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdtp {
    static {
        new zz();
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        zzdsh.b(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return b(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = zzdtq.a(i, 2);
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] b(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
