package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdre {
    public static File a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static File c(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(b(str, file), str2);
    }

    public static boolean d(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            IOUtils.a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.a(fileOutputStream);
            throw th;
        }
    }

    public static boolean e(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File e2 : file.listFiles()) {
                e(e2);
            }
        }
        return file.delete();
    }

    public static byte[] f(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] c2 = zzeer.K(fileInputStream).c();
                IOUtils.a(fileInputStream);
                return c2;
            } catch (IOException unused) {
                IOUtils.a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                IOUtils.a(fileInputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
            IOUtils.a(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.a(fileInputStream2);
            throw th;
        }
    }
}
