package com.google.android.play.core.install.d;

import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, String> f11475a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, String> f11476b = new HashMap();

    static {
        f11475a.put(-2, "An unknown error occurred.");
        f11475a.put(-3, "The API is not available on this device.");
        f11475a.put(-4, "The request that was sent by the app is malformed.");
        f11475a.put(-5, "The install is unavailable to this user or device.");
        f11475a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f11475a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f11475a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f11475a.put(-100, "An internal error happened in the Play Store.");
        f11476b.put(-2, "ERROR_UNKNOWN");
        f11476b.put(-3, "ERROR_API_NOT_AVAILABLE");
        f11476b.put(-4, "ERROR_INVALID_REQUEST");
        f11476b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        f11476b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        f11476b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        f11476b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        f11476b.put(-100, "ERROR_INTERNAL_ERROR");
        f11476b.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
    }

    public static String a(int i) {
        Map<Integer, String> map = f11475a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !f11476b.containsKey(valueOf)) {
            return "";
        }
        String str = f11475a.get(valueOf);
        String str2 = f11476b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
