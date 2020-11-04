package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static <TResult> void a(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.B()) {
            taskCompletionSource.c(tresult);
        } else {
            taskCompletionSource.b(new ApiException(status));
        }
    }
}
