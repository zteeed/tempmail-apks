package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzaq {

    /* renamed from: a  reason: collision with root package name */
    private static String f6037a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6038b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f6039c = zzaq.class.getName();

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f6040c = zzaq.f6038b;

        /* renamed from: a  reason: collision with root package name */
        private final List<s3> f6041a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f6042b = false;

        a() {
        }

        public final synchronized void a(String str, long j) {
            if (!this.f6042b) {
                this.f6041a.add(new s3(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public final synchronized void b(String str) {
            long j;
            this.f6042b = true;
            if (this.f6041a.size() == 0) {
                j = 0;
            } else {
                j = this.f6041a.get(this.f6041a.size() - 1).f5044c - this.f6041a.get(0).f5044c;
            }
            if (j > 0) {
                long j2 = this.f6041a.get(0).f5044c;
                zzaq.a("(%-4d ms) %s", Long.valueOf(j), str);
                for (s3 next : this.f6041a) {
                    long j3 = next.f5044c;
                    zzaq.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f5043b), next.f5042a);
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f6042b) {
                b("Request on the loose");
                zzaq.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f6037a, d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f6037a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f6038b) {
            Log.v(f6037a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f6039c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(f6037a, d(str, objArr), th);
    }
}
