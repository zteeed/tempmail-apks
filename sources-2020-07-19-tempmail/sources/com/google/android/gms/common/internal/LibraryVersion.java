package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {

    /* renamed from: b  reason: collision with root package name */
    private static final GmsLogger f3016b = new GmsLogger("LibraryVersion", "");

    /* renamed from: c  reason: collision with root package name */
    private static LibraryVersion f3017c = new LibraryVersion();

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f3018a = new ConcurrentHashMap<>();

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @KeepForSdk
    public static LibraryVersion a() {
        return f3017c;
    }

    @KeepForSdk
    public String b(String str) {
        Preconditions.h(str, "Please provide a valid libraryName");
        if (this.f3018a.containsKey(str)) {
            return this.f3018a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", (String) null);
                GmsLogger gmsLogger = f3016b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                gmsLogger.e("LibraryVersion", sb.toString());
            } else {
                GmsLogger gmsLogger2 = f3016b;
                String valueOf = String.valueOf(str);
                gmsLogger2.c("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e2) {
            GmsLogger gmsLogger3 = f3016b;
            String valueOf2 = String.valueOf(str);
            gmsLogger3.d("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e2);
        }
        if (str2 == null) {
            f3016b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.f3018a.put(str, str2);
        return str2;
    }
}
