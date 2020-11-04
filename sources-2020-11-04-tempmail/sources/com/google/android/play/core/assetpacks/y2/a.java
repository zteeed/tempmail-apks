package com.google.android.play.core.assetpacks.y2;

import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, String> f11464a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, String> f11465b = new HashMap();

    static {
        f11464a.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        f11464a.put(-2, "The requested pack is not available.");
        f11464a.put(-3, "The request is invalid.");
        f11464a.put(-4, "The requested download is not found.");
        f11464a.put(-5, "The Asset Delivery API is not available.");
        f11464a.put(-6, "Network error. Unable to obtain the asset pack details.");
        f11464a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f11464a.put(-10, "Asset pack download failed due to insufficient storage.");
        f11464a.put(-11, "The Play Store app is either not installed or not the official version.");
        f11464a.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        f11464a.put(-100, "Unknown error downloading an asset pack.");
        f11465b.put(-1, "APP_UNAVAILABLE");
        f11465b.put(-2, "PACK_UNAVAILABLE");
        f11465b.put(-3, "INVALID_REQUEST");
        f11465b.put(-4, "DOWNLOAD_NOT_FOUND");
        f11465b.put(-5, "API_NOT_AVAILABLE");
        f11465b.put(-6, "NETWORK_ERROR");
        f11465b.put(-7, "ACCESS_DENIED");
        f11465b.put(-10, "INSUFFICIENT_STORAGE");
        f11465b.put(-11, "PLAY_STORE_NOT_FOUND");
        f11465b.put(-12, "NETWORK_UNRESTRICTED");
        f11465b.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i) {
        Map<Integer, String> map = f11464a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        String str = f11464a.get(valueOf);
        String str2 = f11465b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
