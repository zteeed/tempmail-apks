package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentManager */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    FragmentState[] f1451b;

    /* renamed from: c  reason: collision with root package name */
    int[] f1452c;

    /* renamed from: d  reason: collision with root package name */
    BackStackState[] f1453d;

    /* renamed from: e  reason: collision with root package name */
    int f1454e = -1;

    /* renamed from: f  reason: collision with root package name */
    int f1455f;

    /* compiled from: FragmentManager */
    static class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1451b, i);
        parcel.writeIntArray(this.f1452c);
        parcel.writeTypedArray(this.f1453d, i);
        parcel.writeInt(this.f1454e);
        parcel.writeInt(this.f1455f);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1451b = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1452c = parcel.createIntArray();
        this.f1453d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1454e = parcel.readInt();
        this.f1455f = parcel.readInt();
    }
}
