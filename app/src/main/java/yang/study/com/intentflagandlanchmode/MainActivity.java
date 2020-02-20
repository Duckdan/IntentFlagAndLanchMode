package yang.study.com.intentflagandlanchmode;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String TAG = MainActivity.class.getSimpleName() + "Flag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "MainActivity::onCreate" + "::TaskId::" + getTaskId());
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(TAG, "MainActivity::onPostCreate" + "::TaskId::" + getTaskId());
    }

    //存在嵌套Fragment的时候调用
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG, "MainActivity::onAttachFragment" + "::TaskId::" + getTaskId());
    }


    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(TAG, "MainActivity::onContentChanged" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "MainActivity::onRestart" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "MainActivity::onStart" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "MainActivity::onResume" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "MainActivity::onPostResume" + "::TaskId::" + getTaskId());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(TAG, "MainActivity::onAttachedToWindow" + "::TaskId::" + getTaskId());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(TAG, "MainActivity::onCreateOptionsMenu" + "::TaskId::" + getTaskId());
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(TAG, "MainActivity::onPrepareOptionsMenu" + "::TaskId::" + getTaskId());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "MainActivity::onPause" + "::TaskId::" + getTaskId());
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "MainActivity::onStop" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "MainActivity::onDestroy" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "MainActivity::onNewIntent" + "::TaskId::" + getTaskId());
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(TAG, "MainActivity::onDetachedFromWindow" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "MainActivity::onRestoreInstanceState" + "::TaskId::" + getTaskId());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "MainActivity::onSaveInstanceState" + "::TaskId::" + getTaskId());
    }

    //新版Android系统当屏幕旋转时该方法已经不在会被调用了
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "MainActivity::onConfigurationChanged" + "::TaskId::" + getTaskId());
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(TAG, "MainActivity::onUserInteraction" + "::TaskId::" + getTaskId());
    }



    public void jumpActivity(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("activity", "activity1_To_activity2" + "::TaskId::" + getTaskId());
        startActivity(intent);
    }
}
