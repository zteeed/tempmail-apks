package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzj;
import com.google.android.gms.internal.firebase_messaging.zzk;
import com.google.android.gms.internal.firebase_messaging.zzm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final class t implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final URL f11433b;

    /* renamed from: c  reason: collision with root package name */
    private Task<Bitmap> f11434c;

    /* renamed from: d  reason: collision with root package name */
    private volatile InputStream f11435d;

    private t(URL url) {
        this.f11433b = url;
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new t(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private final byte[] f() throws IOException {
        URLConnection openConnection = this.f11433b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f11435d = inputStream;
                byte[] b2 = zzj.b(zzj.a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = b2.length;
                    String valueOf = String.valueOf(this.f11433b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (b2.length <= 1048576) {
                    return b2;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                zzm.b(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final Task<Bitmap> a() {
        Task<Bitmap> task = this.f11434c;
        Preconditions.k(task);
        return task;
    }

    public final void close() {
        try {
            zzk.a(this.f11435d);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }

    public final void d(Executor executor) {
        this.f11434c = Tasks.c(executor, new v(this));
    }

    public final Bitmap e() throws IOException {
        String valueOf = String.valueOf(this.f11433b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] f2 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f2, 0, f2.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f11433b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f11433b);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }
}
