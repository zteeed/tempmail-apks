package com.tempmail.t;

import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.r.m;
import java.util.List;
import java.util.Map;

/* compiled from: InboxAllContract */
public interface r extends m {
    void S(ApiError apiError);

    void c0(boolean z, Map<String, List<ExtendedMail>> map);
}
