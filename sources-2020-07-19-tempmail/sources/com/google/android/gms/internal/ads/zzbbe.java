package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbbe implements zzbar {

    /* renamed from: a  reason: collision with root package name */
    private final String f6136a;

    public zzbbe() {
        this((String) null);
    }

    public final void a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            String valueOf = String.valueOf(str);
            zzbba.f(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzwg.a();
            zzbaq.i(true, httpURLConnection, this.f6136a);
            zzbau zzbau = new zzbau();
            zzbau.i(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            zzbau.h(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                zzbba.i(sb.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            zzbba.i(sb2.toString());
        } catch (IOException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            zzbba.i(sb3.toString());
        } catch (RuntimeException e4) {
            String message3 = e4.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            zzbba.i(sb4.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public zzbbe(String str) {
        this.f6136a = str;
    }
}
