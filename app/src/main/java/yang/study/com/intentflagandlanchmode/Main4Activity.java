package yang.study.com.intentflagandlanchmode;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class Main4Activity extends AppCompatActivity {
    String TAG = MainActivity.class.getSimpleName()+"Flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"Main4Activity::onCreate");
        setContentView(R.layout.activity_main4);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(TAG,"Main4Activity::onPostCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"Main4Activity::onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"Main4Activity::onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"Main4Activity::onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG,"Main4Activity::onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG,"Main4Activity::onAttachedToWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"Main4Activity::onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"Main4Activity::onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"Main4Activity::onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG,"Main4Activity::onNewIntent");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG,"Main4Activity::onDetachedFromWindow");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "Main4Activity::onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "Main4Activity::onSaveInstanceState");
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(TAG, "Main4Activity::onUserInteraction");
    }


    public void jumpActivity(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("activity","activity4_To_activity2");
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
