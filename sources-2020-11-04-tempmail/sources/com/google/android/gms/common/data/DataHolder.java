package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
@KeepForSdk
@SafeParcelable.Class
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    @SafeParcelable.VersionField

    /* renamed from: b  reason: collision with root package name */
    private final int f3122b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String[] f3123c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3124d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final CursorWindow[] f3125e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final int f3126f;
    @SafeParcelable.Field
    private final Bundle g;
    private int[] h;
    private int i;
    private boolean j = false;
    private boolean k = true;

    public static class zaa extends RuntimeException {
    }

    static {
        new a(new String[0], (String) null);
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f3122b = i2;
        this.f3123c = strArr;
        this.f3125e = cursorWindowArr;
        this.f3126f = i3;
        this.g = bundle;
    }

    private final void J(String str, int i2) {
        Bundle bundle = this.f3124d;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.i) {
            throw new CursorIndexOutOfBoundsException(i2, this.i);
        }
    }

    @KeepForSdk
    public final int A() {
        return this.f3126f;
    }

    @KeepForSdk
    public final String B(String str, int i2, int i3) {
        J(str, i2);
        return this.f3125e[i3].getString(i2, this.f3124d.getInt(str));
    }

    @KeepForSdk
    public final int G(int i2) {
        int i3 = 0;
        Preconditions.n(i2 >= 0 && i2 < this.i);
        while (true) {
            int[] iArr = this.h;
            if (i3 >= iArr.length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == this.h.length ? i3 - 1 : i3;
    }

    public final void K() {
        this.f3124d = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f3123c;
            if (i3 >= strArr.length) {
                break;
            }
            this.f3124d.putInt(strArr[i3], i3);
            i3++;
        }
        this.h = new int[this.f3125e.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f3125e;
            if (i2 < cursorWindowArr.length) {
                this.h[i2] = i4;
                i4 += this.f3125e[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.i = i4;
                return;
            }
        }
    }

    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                for (CursorWindow close : this.f3125e) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.k && this.f3125e.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final int getCount() {
        return this.i;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    @KeepForSdk
    public final byte[] u(String str, int i2, int i3) {
        J(str, i2);
        return this.f3125e[i3].getBlob(i2, this.f3124d.getInt(str));
    }

    @KeepForSdk
    public final Bundle v() {
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, this.f3123c, false);
        SafeParcelWriter.w(parcel, 2, this.f3125e, i2, false);
        SafeParcelWriter.l(parcel, 3, A());
        SafeParcelWriter.e(parcel, 4, v(), false);
        SafeParcelWriter.l(parcel, 1000, this.f3122b);
        SafeParcelWriter.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public static class Builder {
        private Builder(String[] strArr, String str) {
            Preconditions.k(strArr);
            String[] strArr2 = strArr;
            new ArrayList();
            new HashMap();
        }

        /* synthetic */ Builder(String[] strArr, String str, a aVar) {
            this(strArr, (String) null);
        }
    }
}
