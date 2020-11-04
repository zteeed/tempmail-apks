package com.google.firebase.j;

import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final class e {
    public static String a() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
