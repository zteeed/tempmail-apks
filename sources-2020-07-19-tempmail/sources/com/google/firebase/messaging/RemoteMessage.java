package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new y();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    Bundle f11370b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f11371c;

    /* renamed from: d  reason: collision with root package name */
    private a f11372d;

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f11373a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11374b;

        /* renamed from: c  reason: collision with root package name */
        private final String f11375c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f11376d;

        private a(w wVar) {
            this.f11373a = wVar.c("gcm.n.title");
            wVar.m("gcm.n.title");
            d(wVar, "gcm.n.title");
            this.f11374b = wVar.c("gcm.n.body");
            wVar.m("gcm.n.body");
            d(wVar, "gcm.n.body");
            wVar.c("gcm.n.icon");
            this.f11375c = wVar.e();
            wVar.c("gcm.n.tag");
            wVar.c("gcm.n.color");
            wVar.c("gcm.n.click_action");
            wVar.c("gcm.n.android_channel_id");
            this.f11376d = wVar.a();
            wVar.c("gcm.n.image");
            wVar.c("gcm.n.ticker");
            wVar.h("gcm.n.notification_priority");
            wVar.h("gcm.n.visibility");
            wVar.h("gcm.n.notification_count");
            wVar.g("gcm.n.sticky");
            wVar.g("gcm.n.local_only");
            wVar.g("gcm.n.default_sound");
            wVar.g("gcm.n.default_vibrate_timings");
            wVar.g("gcm.n.default_light_settings");
            wVar.j("gcm.n.event_time");
            wVar.k();
            wVar.i();
        }

        private static String[] d(w wVar, String str) {
            Object[] o = wVar.o(str);
            if (o == null) {
                return null;
            }
            String[] strArr = new String[o.length];
            for (int i = 0; i < o.length; i++) {
                strArr[i] = String.valueOf(o[i]);
            }
            return strArr;
        }

        public String a() {
            return this.f11374b;
        }

        public String b() {
            return this.f11375c;
        }

        public String c() {
            return this.f11373a;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f11370b = bundle;
    }

    public final a A() {
        if (this.f11372d == null && w.d(this.f11370b)) {
            this.f11372d = new a(new w(this.f11370b));
        }
        return this.f11372d;
    }

    public final String B() {
        return this.f11370b.getString("google.to");
    }

    public final Map<String, String> u() {
        if (this.f11371c == null) {
            Bundle bundle = this.f11370b;
            a.e.a aVar = new a.e.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f11371c = aVar;
        }
        return this.f11371c;
    }

    public final String v() {
        return this.f11370b.getString("from");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, this.f11370b, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
