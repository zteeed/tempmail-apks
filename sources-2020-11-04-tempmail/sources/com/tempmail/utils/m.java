package com.tempmail.utils;

import android.util.Log;

/* compiled from: Log */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13120a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f13121b = false;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = " "
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ SecurityException -> 0x0069 }
            java.io.File r2 = new java.io.File     // Catch:{ SecurityException -> 0x0069 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0069 }
            r3.<init>()     // Catch:{ SecurityException -> 0x0069 }
            r3.append(r1)     // Catch:{ SecurityException -> 0x0069 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ SecurityException -> 0x0069 }
            java.lang.String r1 = com.tempmail.utils.y.b.f13138c     // Catch:{ SecurityException -> 0x0069 }
            r3.append(r1)     // Catch:{ SecurityException -> 0x0069 }
            java.lang.String r1 = ".txt"
            r3.append(r1)     // Catch:{ SecurityException -> 0x0069 }
            java.lang.String r1 = r3.toString()     // Catch:{ SecurityException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x0069 }
            boolean r1 = r2.exists()     // Catch:{ SecurityException -> 0x0069 }
            if (r1 != 0) goto L_0x002f
            r2.createNewFile()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0065 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0065 }
            r4 = 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0065 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0065 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0065 }
            r2.<init>()     // Catch:{ IOException -> 0x0065 }
            java.util.Date r3 = new java.util.Date     // Catch:{ IOException -> 0x0065 }
            r3.<init>()     // Catch:{ IOException -> 0x0065 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0065 }
            r2.append(r3)     // Catch:{ IOException -> 0x0065 }
            r2.append(r0)     // Catch:{ IOException -> 0x0065 }
            r2.append(r5)     // Catch:{ IOException -> 0x0065 }
            r2.append(r0)     // Catch:{ IOException -> 0x0065 }
            r2.append(r6)     // Catch:{ IOException -> 0x0065 }
            java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x0065 }
            r1.append(r5)     // Catch:{ IOException -> 0x0065 }
            r1.newLine()     // Catch:{ IOException -> 0x0065 }
            r1.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ SecurityException -> 0x0069 }
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.utils.m.a(java.lang.String, java.lang.String):void");
    }

    public static void b(String str, String str2) {
        if (f13121b) {
            Log.d(str, str2);
        }
        if (f13120a) {
            a(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f13121b) {
            Log.e(str, str2);
        }
        if (f13120a) {
            a(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (f13121b) {
            Log.i(str, str2);
        }
        if (f13120a) {
            a(str, str2);
        }
    }

    public static boolean e() {
        return f13120a;
    }

    public static void f(String str, String str2) {
        if (f13121b) {
            Log.w(str, str2);
        }
        if (f13120a) {
            a(str, str2);
        }
    }

    public static void g(String str, String str2) {
        if (f13121b) {
            Log.wtf(str, str2);
        }
        if (f13120a) {
            a(str, str2);
        }
    }
}
