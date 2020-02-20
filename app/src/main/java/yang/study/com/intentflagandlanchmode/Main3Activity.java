package yang.study.com.intentflagandlanchmode;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    String TAG = MainActivity.class.getSimpleName() + "Flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Main3Activity::onCreate");
        setContentView(R.layout.activity_main3);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(TAG, "Main3Activity::onPostCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Main3Activity::onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Main3Activity::onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Main3Activity::onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "Main3Activity::onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "Main3Activity::onAttachedToWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Main3Activity::onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Main3Activity::onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Main3Activity::onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "Main3Activity::onNewIntent");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG, "Main3Activity::onDetachedFromWindow");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "Main3Activity::onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "Main3Activity::onSaveInstanceState");
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(TAG, "Main3Activity::onUserInteraction");
    }

    public void jumpActivity(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        intent.putExtra("activity", "activity3_To_activity4");
        startActivity(intent);
    }

}
