package io.github.ncca_fbla.fabric;

import android.app.IntentService;
import android.content.Intent;

public class ParseDataRetrievalService extends IntentService {
    public ParseDataRetrievalService() {
        super("ParseDataRetrievalService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // TODO: Load data from Parse and such.
    }
}
