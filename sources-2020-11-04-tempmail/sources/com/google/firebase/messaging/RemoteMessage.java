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
/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new y();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    Bundle f11919b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f11920c;

    /* renamed from: d  reason: collision with root package name */
    private a f11921d;

    /* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f11922a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11923b;

        /* renamed from: c  reason: collision with root package name */
        private final String f11924c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f11925d;

        private a(w wVar) {
            this.f11922a = wVar.c("gcm.n.title");
            wVar.m("gcm.n.title");
            d(wVar, "gcm.n.title");
            this.f11923b = wVar.c("gcm.n.body");
            wVar.m("gcm.n.body");
            d(wVar, "gcm.n.body");
            wVar.c("gcm.n.icon");
            this.f11924c = wVar.e();
            wVar.c("gcm.n.tag");
            wVar.c("gcm.n.color");
            wVar.c("gcm.n.click_action");
            wVar.c("gcm.n.android_channel_id");
            this.f11925d = wVar.a();
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
            return this.f11923b;
        }

        public String b() {
            return this.f11924c;
        }

        public String c() {
            return this.f11922a;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f11919b = bundle;
    }

    public final a A() {
        if (this.f11921d == null && w.d(this.f11919b)) {
            this.f11921d = new a(new w(this.f11919b));
        }
        return this.f11921d;
    }

    public final String B() {
        return this.f11919b.getString("google.to");
    }

    public final Map<String, String> u() {
        if (this.f11920c == null) {
            Bundle bundle = this.f11919b;
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
            this.f11920c = aVar;
        }
        return this.f11920c;
    }

    public final String v() {
        return this.f11919b.getString("from");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.e(parcel, 2, this.f11919b, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
