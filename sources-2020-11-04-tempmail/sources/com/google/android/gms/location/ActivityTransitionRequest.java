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
    public static final Comparator<ActivityTransition> f10023e = new c();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<ActivityTransition> f10024b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f10025c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final List<ClientIdentity> f10026d;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) List<ActivityTransition> list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<ClientIdentity> list2) {
        Preconditions.l(list, "transitions can't be null");
        Preconditions.b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f10023e);
        for (ActivityTransition next : list) {
            Preconditions.b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f10024b = Collections.unmodifiableList(list);
        this.f10025c = str;
        this.f10026d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return Objects.a(this.f10024b, activityTransitionRequest.f10024b) && Objects.a(this.f10025c, activityTransitionRequest.f10025c) && Objects.a(this.f10026d, activityTransitionRequest.f10026d);
        }
    }

    public int hashCode() {
        int hashCode = this.f10024b.hashCode() * 31;
        String str = this.f10025c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f10026d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f10024b);
        String str = this.f10025c;
        String valueOf2 = String.valueOf(this.f10026d);
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
        SafeParcelWriter.x(parcel, 1, this.f10024b, false);
        SafeParcelWriter.t(parcel, 2, this.f10025c, false);
        SafeParcelWriter.x(parcel, 3, this.f10026d, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
