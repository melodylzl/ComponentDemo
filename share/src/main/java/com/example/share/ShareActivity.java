package com.example.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.componentbase.ServiceFactory;

import androidx.annotation.Nullable;

/**
 * @author melody
 * @date 2020/2/3
 */
@Route(path = "/share/share")
public class ShareActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        getIntentData();
        showLoginStatus();
    }

    private void getIntentData() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String shareText = intent.getStringExtra("share_text");
        Log.d("shareText", shareText);
    }

    private void showLoginStatus() {
        String accountId = ServiceFactory.getInstance().getAccountService().getAccountId();
        Toast.makeText(this, accountId, Toast.LENGTH_SHORT).show();
    }
}
