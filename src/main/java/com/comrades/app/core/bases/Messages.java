package com.comrades.app.core.bases;

import java.util.Properties;

public interface Messages {

    Properties getMessages();

    String getMessage(String code, Object... args);

}
