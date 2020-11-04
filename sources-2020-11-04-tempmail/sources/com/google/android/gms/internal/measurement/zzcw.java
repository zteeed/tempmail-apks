package com.google.android.gms.internal.measurement;

import a.e.a;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzcw {

    /* renamed from: a  reason: collision with root package name */
    private static final a<String, Uri> f9780a = new a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (zzcw.class) {
            uri = f9780a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f9780a.put(str, uri);
            }
        }
        return uri;
    }
}
