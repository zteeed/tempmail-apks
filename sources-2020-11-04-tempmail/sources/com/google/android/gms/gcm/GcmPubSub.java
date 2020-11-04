package com.google.android.gms.gcm;

import java.util.regex.Pattern;

@Deprecated
public class GcmPubSub {
    static {
        Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    }
}
