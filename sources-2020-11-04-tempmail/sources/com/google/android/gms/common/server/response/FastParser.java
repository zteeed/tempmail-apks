package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
    }

    public FastParser() {
        new Stack();
    }
}
