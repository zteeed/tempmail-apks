package com.tempmail.s;

import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.q.m;
import java.util.List;
import java.util.Map;

/* compiled from: InboxAllContract */
public interface l extends m {
    void U(ApiError apiError);

    void e0(boolean z, Map<String, List<ExtendedMail>> map);
}
