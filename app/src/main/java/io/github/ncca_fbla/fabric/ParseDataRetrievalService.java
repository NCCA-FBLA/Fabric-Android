/*
 * Copyright (c) NCCA FBLA 2016
 * Written by James Parsons
 *
 */

package io.github.ncca_fbla.fabric;

import android.app.IntentService;
import android.content.Intent;

public class ParseDataRetrievalService extends IntentService {
    public ParseDataRetrievalService() {
        super("ParseDataRetrievalService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        /* First we need to find out for which tab we are loading data.
         * We then build  parse query based on the selected tab.
         * Then, the results of that query are stored in an array and
         * sent back to the calling fragment.
         */
        String cat = intent.getStringExtra("tab");
        switch (cat) {
            case "Home":
                // TODO: Build a query to just grab the first few posts and return them in an array.
                break;
            case "Social":
                // TODO: Get the current user and query for the users that they are following.
                break;
            case "Favorites":
                // TODO: Get the current user and query for their favorite posts.
                break;
        }
    }
}
