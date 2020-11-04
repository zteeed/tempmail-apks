package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        charSequence.toString();
    }
}
