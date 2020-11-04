package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11380a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11381b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11382c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<String> f11383d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11384e;

    private a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11380a = sharedPreferences;
        this.f11381b = str;
        this.f11382c = str2;
        this.f11384e = executor;
    }

    static a0 a(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        synchronized (a0Var.f11383d) {
            a0Var.f11383d.clear();
            String string = a0Var.f11380a.getString(a0Var.f11381b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(a0Var.f11382c)) {
                    String[] split = string.split(a0Var.f11382c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            a0Var.f11383d.add(str3);
                        }
                    }
                }
            }
        }
        return a0Var;
    }

    private final boolean d(boolean z) {
        if (z) {
            this.f11384e.execute(new z(this));
        }
        return z;
    }

    public final String b() {
        String peek;
        synchronized (this.f11383d) {
            peek = this.f11383d.peek();
        }
        return peek;
    }

    public final boolean c(Object obj) {
        boolean remove;
        synchronized (this.f11383d) {
            remove = this.f11383d.remove(obj);
            d(remove);
        }
        return remove;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        synchronized (this.f11383d) {
            SharedPreferences.Editor edit = this.f11380a.edit();
            String str = this.f11381b;
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f11383d.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(this.f11382c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }
}
