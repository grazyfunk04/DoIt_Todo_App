package com.example.doit;

import android.annotation.SuppressLint;
import android.content.DialogInterface;

public interface DialogCloseListener {
    @SuppressLint("NotifyDataSetChanged")
    void handleDialogClose(DialogInterface dialog);
}
