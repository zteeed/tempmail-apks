package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class c0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f11945d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f11946a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11947b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11948c;

    private c0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f11945d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f11946a = str3;
        this.f11947b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f11948c = sb.toString();
    }

    static c0 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new c0(split[0], split[1]);
    }

    public final String a() {
        return this.f11946a;
    }

    public final String b() {
        return this.f11947b;
    }

    public final String d() {
        return this.f11948c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.f11946a.equals(c0Var.f11946a) || !this.f11947b.equals(c0Var.f11947b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.b(this.f11947b, this.f11946a);
    }
}