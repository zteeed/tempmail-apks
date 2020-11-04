package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

@ShowFirstParty
@KeepForSdk
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @VisibleForTesting
    public boolean c(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        Iterator<FastJsonResponse.Field<?, ?>> it = a().values().iterator();
        if (!it.hasNext()) {
            return true;
        }
        b(it.next());
        throw null;
    }

    public int hashCode() {
        Iterator<FastJsonResponse.Field<?, ?>> it = a().values().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        b(it.next());
        throw null;
    }
}
