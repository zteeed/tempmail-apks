package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    private static Clock o = DefaultClock.d();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2626b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private String f2627c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f2628d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private String f2629e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private String f2630f;
    @SafeParcelable.Field
    private Uri g;
    @SafeParcelable.Field
    private String h;
    @SafeParcelable.Field
    private long i;
    @SafeParcelable.Field
    private String j;
    @SafeParcelable.Field
    private List<Scope> k;
    @SafeParcelable.Field
    private String l;
    @SafeParcelable.Field
    private String m;
    private Set<Scope> n = new HashSet();

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @SafeParcelable.Param(id = 11) String str7, @SafeParcelable.Param(id = 12) String str8) {
        this.f2626b = i2;
        this.f2627c = str;
        this.f2628d = str2;
        this.f2629e = str3;
        this.f2630f = str4;
        this.g = uri;
        this.h = str5;
        this.i = j2;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount P(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount Q = Q(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        Q.h = jSONObject.optString("serverAuthCode", (String) null);
        return Q;
    }

    private static GoogleSignInAccount Q(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(o.a() / 1000) : l2).longValue();
        Preconditions.g(str7);
        Preconditions.k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public String A() {
        return this.m;
    }

    public String B() {
        return this.l;
    }

    public String G() {
        return this.f2627c;
    }

    public String J() {
        return this.f2628d;
    }

    public Uri K() {
        return this.g;
    }

    @KeepForSdk
    public Set<Scope> N() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String O() {
        return this.h;
    }

    public Account U() {
        if (this.f2629e == null) {
            return null;
        }
        return new Account(this.f2629e, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.N().equals(N());
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + N().hashCode();
    }

    public String u() {
        return this.f2630f;
    }

    public String v() {
        return this.f2629e;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2626b);
        SafeParcelWriter.t(parcel, 2, G(), false);
        SafeParcelWriter.t(parcel, 3, J(), false);
        SafeParcelWriter.t(parcel, 4, v(), false);
        SafeParcelWriter.t(parcel, 5, u(), false);
        SafeParcelWriter.r(parcel, 6, K(), i2, false);
        SafeParcelWriter.t(parcel, 7, O(), false);
        SafeParcelWriter.o(parcel, 8, this.i);
        SafeParcelWriter.t(parcel, 9, this.j, false);
        SafeParcelWriter.x(parcel, 10, this.k, false);
        SafeParcelWriter.t(parcel, 11, B(), false);
        SafeParcelWriter.t(parcel, 12, A(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
