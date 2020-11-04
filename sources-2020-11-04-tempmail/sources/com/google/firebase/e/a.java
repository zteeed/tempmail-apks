package com.google.firebase.e;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.firebase.c;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public abstract class a {
    public static synchronized a b() {
        a c2;
        synchronized (a.class) {
            c2 = c(c.h());
        }
        return c2;
    }

    public static synchronized a c(c cVar) {
        a aVar;
        Class cls = a.class;
        synchronized (cls) {
            aVar = (a) cVar.f(cls);
        }
        return aVar;
    }

    public abstract Task<b> a(Intent intent);
}
