package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f3202a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f3203b;

        private ToStringHelper(Object obj) {
            Preconditions.k(obj);
            this.f3203b = obj;
            this.f3202a = new ArrayList();
        }

        @KeepForSdk
        public final ToStringHelper a(String str, Object obj) {
            List<String> list = this.f3202a;
            Preconditions.k(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3203b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3202a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f3202a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper c(Object obj) {
        return new ToStringHelper(obj);
    }
}
