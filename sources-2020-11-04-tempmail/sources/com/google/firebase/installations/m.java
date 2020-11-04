package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.n.d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils */
class m {

    /* renamed from: a  reason: collision with root package name */
    public static final long f11856a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f11857b = Pattern.compile("\\AA[\\w-]{38}\\z");

    m() {
    }

    static boolean c(String str) {
        return f11857b.matcher(str).matches();
    }

    static boolean d(String str) {
        return str.contains(":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) && dVar.h() + dVar.c() >= a() + f11856a) {
            return false;
        }
        return true;
    }
}
