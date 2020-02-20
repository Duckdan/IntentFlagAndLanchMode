package yang.study.com.intentflagandlanchmode;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ExampleFragment extends Fragment {

    public static String TAG = MainActivity.class.getSimpleName() + "Flag";

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public ExampleFragment() {
    }


    public static ExampleFragment newInstance(String param1, String param2) {
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        logString("onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        logString("onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        logString("onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logString("onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logString("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        logString("onStart");
    }


    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        logString("onAttachFragment");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        logString("onConfigurationChanged");
    }

    @Override
    public void onResume() {
        super.onResume();
        logString("onResume");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        logString("onSaveInstanceState");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        logString("onViewStateRestored");
    }

    @Override
    public void onPause() {
        super.onPause();
        logString("onPause");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logString("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logString("onDestroy");
    }

    @Override
    public void onStop() {
        super.onStop();
        logString("onStop");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        logString("onDetach");
    }

    public void logString(String logContent) {
        Log.e(TAG, "fragment=======" + logContent);
    }


}
