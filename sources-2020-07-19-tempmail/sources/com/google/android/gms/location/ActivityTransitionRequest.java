package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzf();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator<ActivityTransition> f9837e = new c();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<ActivityTransition> f9838b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f9839c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final List<ClientIdentity> f9840d;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) List<ActivityTransition> list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<ClientIdentity> list2) {
        Preconditions.l(list, "transitions can't be null");
        Preconditions.b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f9837e);
        for (ActivityTransition next : list) {
            Preconditions.b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f9838b = Collections.unmodifiableList(list);
        this.f9839c = str;
        this.f9840d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return Objects.a(this.f9838b, activityTransitionRequest.f9838b) && Objects.a(this.f9839c, activityTransitionRequest.f9839c) && Objects.a(this.f9840d, activityTransitionRequest.f9840d);
        }
    }

    public int hashCode() {
        int hashCode = this.f9838b.hashCode() * 31;
        String str = this.f9839c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f9840d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f9838b);
        String str = this.f9839c;
        String valueOf2 = String.valueOf(this.f9840d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, this.f9838b, false);
        SafeParcelWriter.t(parcel, 2, this.f9839c, false);
        SafeParcelWriter.x(parcel, 3, this.f9840d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
