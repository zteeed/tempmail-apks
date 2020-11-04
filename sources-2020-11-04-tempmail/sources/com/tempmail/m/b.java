package com.tempmail.m;

import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.requests.NewMailboxBody;

/* compiled from: CreateEmailContract */
public interface b {
    void a(boolean z);

    void d(boolean z, String str, String str2);

    void k(ApiError apiError);

    void l(NewMailboxBody newMailboxBody);
}
