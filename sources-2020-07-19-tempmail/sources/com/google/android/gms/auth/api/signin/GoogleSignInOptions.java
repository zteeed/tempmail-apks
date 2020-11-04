package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zad();
    @VisibleForTesting
    public static final Scope k = new Scope("profile");
    @VisibleForTesting
    public static final Scope l = new Scope("openid");
    @VisibleForTesting
    public static final Scope m = new Scope("https://www.googleapis.com/auth/games_lite");
    @VisibleForTesting
    public static final Scope n = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions o;
    public static final GoogleSignInOptions p;
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f2631b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Scope> f2632c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private Account f2633d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f2634e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2635f;
    @SafeParcelable.Field
    private final boolean g;
    @SafeParcelable.Field
    private String h;
    @SafeParcelable.Field
    private String i;
    @SafeParcelable.Field
    private ArrayList<GoogleSignInOptionsExtensionParcelable> j;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Set<Scope> f2636a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private boolean f2637b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2638c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2639d;

        /* renamed from: e  reason: collision with root package name */
        private String f2640e;

        /* renamed from: f  reason: collision with root package name */
        private Account f2641f;
        private String g;
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> h = new HashMap();

        public final GoogleSignInOptions a() {
            if (this.f2636a.contains(GoogleSignInOptions.n) && this.f2636a.contains(GoogleSignInOptions.m)) {
                this.f2636a.remove(GoogleSignInOptions.m);
            }
            if (this.f2639d && (this.f2641f == null || !this.f2636a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f2636a), this.f2641f, this.f2639d, this.f2637b, this.f2638c, this.f2640e, this.g, this.h, (a) null);
        }

        public final Builder b() {
            this.f2636a.add(GoogleSignInOptions.l);
            return this;
        }

        public final Builder c() {
            this.f2636a.add(GoogleSignInOptions.k);
            return this;
        }

        public final Builder d(Scope scope, Scope... scopeArr) {
            this.f2636a.add(scope);
            this.f2636a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    static {
        new Scope("email");
        Builder b2 = new Builder().b();
        b2.c();
        o = b2.a();
        Builder builder = new Builder();
        builder.d(m, new Scope[0]);
        p = builder.a();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, K(arrayList2));
    }

    private static Map<Integer, GoogleSignInOptionsExtensionParcelable> K(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.u()), next);
        }
        return hashMap;
    }

    @KeepForSdk
    public String A() {
        return this.h;
    }

    @KeepForSdk
    public boolean B() {
        return this.g;
    }

    @KeepForSdk
    public boolean G() {
        return this.f2634e;
    }

    @KeepForSdk
    public boolean J() {
        return this.f2635f;
    }

    @KeepForSdk
    public Account U() {
        return this.f2633d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f2633d.equals(r4.U()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.h.equals(r4.A()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.j     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 > 0) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.j     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0085
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f2632c     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.v()     // Catch:{ ClassCastException -> 0x0085 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f2632c     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.v()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0085
        L_0x0035:
            android.accounts.Account r1 = r3.f2633d     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.U()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f2633d     // Catch:{ ClassCastException -> 0x0085 }
            android.accounts.Account r2 = r4.U()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.h     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.A()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.h     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r2 = r4.A()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.g     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.B()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f2634e     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.G()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f2635f     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.J()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f2632c;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.u());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.f2633d);
        hashAccumulator.a(this.h);
        hashAccumulator.c(this.g);
        hashAccumulator.c(this.f2634e);
        hashAccumulator.c(this.f2635f);
        return hashAccumulator.b();
    }

    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> u() {
        return this.j;
    }

    @KeepForSdk
    public ArrayList<Scope> v() {
        return new ArrayList<>(this.f2632c);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f2631b);
        SafeParcelWriter.x(parcel, 2, v(), false);
        SafeParcelWriter.r(parcel, 3, U(), i2, false);
        SafeParcelWriter.c(parcel, 4, G());
        SafeParcelWriter.c(parcel, 5, J());
        SafeParcelWriter.c(parcel, 6, B());
        SafeParcelWriter.t(parcel, 7, A(), false);
        SafeParcelWriter.t(parcel, 8, this.i, false);
        SafeParcelWriter.x(parcel, 9, u(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f2631b = i2;
        this.f2632c = arrayList;
        this.f2633d = account;
        this.f2634e = z;
        this.f2635f = z2;
        this.g = z3;
        this.h = str;
        this.i = str2;
        this.j = new ArrayList<>(map.values());
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, a aVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }
}
