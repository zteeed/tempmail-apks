package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.google.android.play.core.internal.x;
import com.google.android.play.core.splitinstall.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static d f11444a;

    static synchronized d a(Context context) {
        d dVar;
        synchronized (w1.class) {
            if (f11444a == null) {
                q0 q0Var = new q0((byte[]) null);
                q0Var.b(new z2(a.a(context)));
                f11444a = q0Var.a();
            }
            dVar = f11444a;
        }
        return dVar;
    }

    static String b(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    x.a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    public static boolean c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    static boolean d(int i, int i2) {
        if (i == 5 && i2 != 5) {
            return true;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    static long e(byte[] bArr, int i) {
        return ((long) ((g(bArr, i + 2) << 16) | g(bArr, i))) & 4294967295L;
    }

    public static boolean f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    static int g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static boolean h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
