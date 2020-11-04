package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p.d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils */
class o {

    /* renamed from: a  reason: collision with root package name */
    public static final long f11307a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f11308b = Pattern.compile("\\AA[\\w-]{38}\\z");

    o() {
    }

    static boolean c(String str) {
        return f11308b.matcher(str).matches();
    }

    static boolean d(String str) {
        return str.contains(":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) && dVar.h() + dVar.c() >= a() + f11307a) {
            return false;
        }
        return true;
    }
}
