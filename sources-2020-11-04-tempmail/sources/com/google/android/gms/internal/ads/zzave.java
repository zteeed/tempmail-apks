package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzave extends zzaug {

    /* renamed from: b  reason: collision with root package name */
    private final String f6161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6162c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzave(zzaub zzaub) {
        this(zzaub != null ? zzaub.f6144b : "", zzaub != null ? zzaub.f6145c : 1);
    }

    public final int getAmount() throws RemoteException {
        return this.f6162c;
    }

    public final String getType() throws RemoteException {
        return this.f6161b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzave(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzave(String str, int i) {
        this.f6161b = str;
        this.f6162c = i;
    }
}
