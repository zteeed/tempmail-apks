package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.r;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f1456b;

    /* renamed from: c  reason: collision with root package name */
    final int f1457c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f1458d;

    /* renamed from: e  reason: collision with root package name */
    final int f1459e;

    /* renamed from: f  reason: collision with root package name */
    final int f1460f;
    final String g;
    final boolean h;
    final boolean i;
    final Bundle j;
    final boolean k;
    Bundle l;
    Fragment m;

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
        this.f1456b = fragment.getClass().getName();
        this.f1457c = fragment.f1441f;
        this.f1458d = fragment.n;
        this.f1459e = fragment.y;
        this.f1460f = fragment.z;
        this.g = fragment.A;
        this.h = fragment.D;
        this.i = fragment.C;
        this.j = fragment.h;
        this.k = fragment.B;
    }

    public Fragment a(f fVar, d dVar, Fragment fragment, i iVar, r rVar) {
        if (this.m == null) {
            Context e2 = fVar.e();
            Bundle bundle = this.j;
            if (bundle != null) {
                bundle.setClassLoader(e2.getClassLoader());
            }
            if (dVar != null) {
                this.m = dVar.a(e2, this.f1456b, this.j);
            } else {
                this.m = Fragment.o0(e2, this.f1456b, this.j);
            }
            Bundle bundle2 = this.l;
            if (bundle2 != null) {
                bundle2.setClassLoader(e2.getClassLoader());
                this.m.f1438c = this.l;
            }
            this.m.R1(this.f1457c, fragment);
            Fragment fragment2 = this.m;
            fragment2.n = this.f1458d;
            fragment2.p = true;
            fragment2.y = this.f1459e;
            fragment2.z = this.f1460f;
            fragment2.A = this.g;
            fragment2.D = this.h;
            fragment2.C = this.i;
            fragment2.B = this.k;
            fragment2.s = fVar.f1495d;
            if (h.F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.m);
            }
        }
        Fragment fragment3 = this.m;
        fragment3.v = iVar;
        fragment3.w = rVar;
        return fragment3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1456b);
        parcel.writeInt(this.f1457c);
        parcel.writeInt(this.f1458d ? 1 : 0);
        parcel.writeInt(this.f1459e);
        parcel.writeInt(this.f1460f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
    }

    FragmentState(Parcel parcel) {
        this.f1456b = parcel.readString();
        this.f1457c = parcel.readInt();
        boolean z = true;
        this.f1458d = parcel.readInt() != 0;
        this.f1459e = parcel.readInt();
        this.f1460f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z;
        this.l = parcel.readBundle();
    }
}
