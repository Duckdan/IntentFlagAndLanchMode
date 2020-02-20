package yang.study.com.intentflagandlanchmode;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    String TAG = MainActivity.class.getSimpleName() + "Flag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Main2Activity::onCreate");
        setContentView(R.layout.activity_main2);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(TAG, "Main2Activity::onPostCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Main2Activity::onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Main2Activity::onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Main2Activity::onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "Main2Activity::onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "Main2Activity::onAttachedToWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Main2Activity::onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Main2Activity::onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Main2Activity::onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "Main2Activity::onNewIntent");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG, "Main2Activity::onDetachedFromWindow");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "Main2Activity::onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "Main2Activity::onSaveInstanceState");
    }

    public void jumpActivity(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("activity", "activity2_To_activity3");
        startActivity(intent);
    }

}
