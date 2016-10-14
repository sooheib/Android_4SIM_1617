package com.sim.fragmentandroid.fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ProgressDialogFrag extends DialogFragment{
    public ProgressDialog mProgressDialog = null;
    public int            mMax            = 100;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, 0);
        setRetainInstance(true);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setTitle("Downloading...");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.setCancelable(true);
        mProgressDialog.setProgress(0);
        mProgressDialog.setMax(mMax);
        mProgressDialog.setCanceledOnTouchOutside(false);
        return mProgressDialog;
    }

    @Override
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance())
            getDialog().setDismissMessage(null);
        super.onDestroyView();
    }

    public void setMax(int arg1) {
        mProgressDialog.setMax(arg1);
        mMax = arg1;
    }

    public void setProgress(int arg1) {
        mProgressDialog.setProgress(arg1);
    }
}
