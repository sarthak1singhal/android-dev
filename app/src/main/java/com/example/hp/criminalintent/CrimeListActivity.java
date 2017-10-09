package com.example.hp.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by HP on 6/15/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    //@Override
    protected Fragment createFragment() {
        return new CrimeListFragment();

    }}