package com.google.firebase.analytics.a;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;

public interface a {

    @KeepForSdk
    /* renamed from: com.google.firebase.analytics.a.a$a  reason: collision with other inner class name */
    public interface C0100a {
        @KeepForSdk
        void unregister();
    }

    @KeepForSdk
    public interface b {
        @KeepForSdk
        void onMessageTriggered(int i, Bundle bundle);
    }

    @KeepForSdk
    public static class c {
        @KeepForSdk

        /* renamed from: a  reason: collision with root package name */
        public String f10995a;
        @KeepForSdk

        /* renamed from: b  reason: collision with root package name */
        public String f10996b;
        @KeepForSdk

        /* renamed from: c  reason: collision with root package name */
        public Object f10997c;
        @KeepForSdk

        /* renamed from: d  reason: collision with root package name */
        public String f10998d;
        @KeepForSdk

        /* renamed from: e  reason: collision with root package name */
        public long f10999e;
        @KeepForSdk

        /* renamed from: f  reason: collision with root package name */
        public String f11000f;
        @KeepForSdk
        public Bundle g;
        @KeepForSdk
        public String h;
        @KeepForSdk
        public Bundle i;
        @KeepForSdk
        public long j;
        @KeepForSdk
        public String k;
        @KeepForSdk
        public Bundle l;
        @KeepForSdk
        public long m;
        @KeepForSdk
        public boolean n;
        @KeepForSdk
        public long o;
    }

    @KeepForSdk
    void Q(String str, String str2, Bundle bundle);

    @KeepForSdk
    int T(String str);

    @KeepForSdk
    List<c> X(String str, String str2);

    @KeepForSdk
    Map<String, Object> a(boolean z);

    @KeepForSdk
    void b(c cVar);

    @KeepForSdk
    void c(String str, String str2, Object obj);

    @KeepForSdk
    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    @KeepForSdk
    C0100a d(String str, b bVar);
}
