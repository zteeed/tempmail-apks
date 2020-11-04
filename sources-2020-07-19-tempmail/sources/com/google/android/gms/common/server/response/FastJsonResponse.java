package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    @SafeParcelable.Class
    @VisibleForTesting
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();
        @SafeParcelable.VersionField

        /* renamed from: b  reason: collision with root package name */
        private final int f3086b;
        @SafeParcelable.Field

        /* renamed from: c  reason: collision with root package name */
        protected final int f3087c;
        @SafeParcelable.Field

        /* renamed from: d  reason: collision with root package name */
        protected final boolean f3088d;
        @SafeParcelable.Field

        /* renamed from: e  reason: collision with root package name */
        protected final int f3089e;
        @SafeParcelable.Field

        /* renamed from: f  reason: collision with root package name */
        protected final boolean f3090f;
        @SafeParcelable.Field
        protected final String g;
        @SafeParcelable.Field
        protected final int h;
        protected final Class<? extends FastJsonResponse> i;
        @SafeParcelable.Field
        private final String j;
        private zak k;
        /* access modifiers changed from: private */
        @SafeParcelable.Field
        public FieldConverter<I, O> l;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) zaa zaa) {
            this.f3086b = i2;
            this.f3087c = i3;
            this.f3088d = z;
            this.f3089e = i4;
            this.f3090f = z2;
            this.g = str;
            this.h = i5;
            if (str2 == null) {
                this.i = null;
                this.j = null;
            } else {
                this.i = SafeParcelResponse.class;
                this.j = str2;
            }
            if (zaa == null) {
                this.l = null;
            } else {
                this.l = zaa.v();
            }
        }

        private final String B() {
            String str = this.j;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final zaa J() {
            FieldConverter<I, O> fieldConverter = this.l;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.u(fieldConverter);
        }

        public final void A(zak zak) {
            this.k = zak;
        }

        public final boolean G() {
            return this.l != null;
        }

        public final Map<String, Field<?, ?>> K() {
            Preconditions.k(this.j);
            Preconditions.k(this.k);
            return this.k.A(this.j);
        }

        public final I h(O o) {
            return this.l.h(o);
        }

        public String toString() {
            Objects.ToStringHelper c2 = Objects.c(this);
            c2.a("versionCode", Integer.valueOf(this.f3086b));
            c2.a("typeIn", Integer.valueOf(this.f3087c));
            c2.a("typeInArray", Boolean.valueOf(this.f3088d));
            c2.a("typeOut", Integer.valueOf(this.f3089e));
            c2.a("typeOutArray", Boolean.valueOf(this.f3090f));
            c2.a("outputFieldName", this.g);
            c2.a("safeParcelFieldId", Integer.valueOf(this.h));
            c2.a("concreteTypeName", B());
            Class<? extends FastJsonResponse> cls = this.i;
            if (cls != null) {
                c2.a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.l;
            if (fieldConverter != null) {
                c2.a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return c2.toString();
        }

        @KeepForSdk
        public int u() {
            return this.h;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            int a2 = SafeParcelWriter.a(parcel);
            SafeParcelWriter.l(parcel, 1, this.f3086b);
            SafeParcelWriter.l(parcel, 2, this.f3087c);
            SafeParcelWriter.c(parcel, 3, this.f3088d);
            SafeParcelWriter.l(parcel, 4, this.f3089e);
            SafeParcelWriter.c(parcel, 5, this.f3090f);
            SafeParcelWriter.t(parcel, 6, this.g, false);
            SafeParcelWriter.l(parcel, 7, u());
            SafeParcelWriter.t(parcel, 8, B(), false);
            SafeParcelWriter.r(parcel, 9, J(), i2, false);
            SafeParcelWriter.b(parcel, a2);
        }
    }

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        I h(O o);
    }

    protected static <O, I> I d(Field<I, O> field, Object obj) {
        return field.l != null ? field.h(obj) : obj;
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> a();

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean b(Field field) {
        if (field.f3089e != 11) {
            c(field.g);
            throw null;
        } else if (field.f3090f) {
            String str = field.g;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        } else {
            String str2 = field.g;
            throw new UnsupportedOperationException("Concrete types not supported");
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract boolean c(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a2 = a();
        StringBuilder sb = new StringBuilder(100);
        Iterator<String> it = a2.keySet().iterator();
        if (!it.hasNext()) {
            if (sb.length() > 0) {
                sb.append("}");
            } else {
                sb.append("{}");
            }
            return sb.toString();
        }
        b(a2.get(it.next()));
        throw null;
    }
}
