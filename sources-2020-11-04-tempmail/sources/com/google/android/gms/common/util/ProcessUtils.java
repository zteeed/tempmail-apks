package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@KeepForSdk
public class ProcessUtils {

    /* renamed from: a  reason: collision with root package name */
    private static String f3307a;

    /* renamed from: b  reason: collision with root package name */
    private static int f3308b;

    private ProcessUtils() {
    }

    @KeepForSdk
    @Nullable
    public static String a() {
        if (f3307a == null) {
            if (f3308b == 0) {
                f3308b = Process.myPid();
            }
            f3307a = b(f3308b);
        }
        return f3307a;
    }

    @Nullable
    private static String b(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = c(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
                IOUtils.a(bufferedReader);
            } catch (IOException unused) {
                IOUtils.a(bufferedReader);
                return str;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.a(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            IOUtils.a(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            IOUtils.a(bufferedReader);
            throw th;
        }
        return str;
    }

    private static BufferedReader c(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
