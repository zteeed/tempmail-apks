package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzaq {

    /* renamed from: a  reason: collision with root package name */
    private static String f5854a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5855b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f5856c = zzaq.class.getName();

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f5857c = zzaq.f5855b;

        /* renamed from: a  reason: collision with root package name */
        private final List<s3> f5858a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f5859b = false;

        a() {
        }

        public final synchronized void a(String str, long j) {
            if (!this.f5859b) {
                this.f5858a.add(new s3(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public final synchronized void b(String str) {
            long j;
            this.f5859b = true;
            if (this.f5858a.size() == 0) {
                j = 0;
            } else {
                j = this.f5858a.get(this.f5858a.size() - 1).f4861c - this.f5858a.get(0).f4861c;
            }
            if (j > 0) {
                long j2 = this.f5858a.get(0).f4861c;
                zzaq.a("(%-4d ms) %s", Long.valueOf(j), str);
                for (s3 next : this.f5858a) {
                    long j3 = next.f4861c;
                    zzaq.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f4860b), next.f4859a);
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f5859b) {
                b("Request on the loose");
                zzaq.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f5854a, d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f5854a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f5855b) {
            Log.v(f5854a, d(str, objArr));
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
            } else if (!stackTrace[i].getClassName().equals(f5856c)) {
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
        Log.e(f5854a, d(str, objArr), th);
    }
}
