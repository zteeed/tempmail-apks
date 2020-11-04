package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<FragmentState> f1485b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f1486c;

    /* renamed from: d  reason: collision with root package name */
    BackStackState[] f1487d;

    /* renamed from: e  reason: collision with root package name */
    int f1488e;

    /* renamed from: f  reason: collision with root package name */
    String f1489f = null;

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
        parcel.writeTypedList(this.f1485b);
        parcel.writeStringList(this.f1486c);
        parcel.writeTypedArray(this.f1487d, i);
        parcel.writeInt(this.f1488e);
        parcel.writeString(this.f1489f);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1485b = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1486c = parcel.createStringArrayList();
        this.f1487d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1488e = parcel.readInt();
        this.f1489f = parcel.readString();
    }
}
