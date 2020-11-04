package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class iz {
    static {
        Logger.getLogger(iz.class.getName());
    }

    private iz() {
    }

    static String a(@NullableDecl String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    static boolean b(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    static String c(@NullableDecl String str) {
        return str == null ? "" : str;
    }
}
