package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f1490b;

    /* renamed from: c  reason: collision with root package name */
    final String f1491c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f1492d;

    /* renamed from: e  reason: collision with root package name */
    final int f1493e;

    /* renamed from: f  reason: collision with root package name */
    final int f1494f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;

    static class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f1490b = fragment.getClass().getName();
        this.f1491c = fragment.f1472f;
        this.f1492d = fragment.n;
        this.f1493e = fragment.w;
        this.f1494f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.g;
        this.l = fragment.z;
        this.m = fragment.Q.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1490b);
        sb.append(" (");
        sb.append(this.f1491c);
        sb.append(")}:");
        if (this.f1492d) {
            sb.append(" fromLayout");
        }
        if (this.f1494f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1494f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1490b);
        parcel.writeString(this.f1491c);
        parcel.writeInt(this.f1492d ? 1 : 0);
        parcel.writeInt(this.f1493e);
        parcel.writeInt(this.f1494f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }

    FragmentState(Parcel parcel) {
        this.f1490b = parcel.readString();
        this.f1491c = parcel.readString();
        boolean z = true;
        this.f1492d = parcel.readInt() != 0;
        this.f1493e = parcel.readInt();
        this.f1494f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }
}
