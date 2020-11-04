package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f11477a;

    public a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f11477a = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    private final int a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", b(this.f11477a, str, objArr));
        }
        return 0;
    }

    private static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() == 0 ? new String("Unable to format ") : "Unable to format ".concat(valueOf), e2);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final void c(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void d(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", b(this.f11477a, str, objArr), th);
        }
    }

    public final void e(String str, Object... objArr) {
        a(6, str, objArr);
    }

    public final void f(String str, Object... objArr) {
        a(4, str, objArr);
    }

    public final void g(String str, Object... objArr) {
        a(5, str, objArr);
    }
}
