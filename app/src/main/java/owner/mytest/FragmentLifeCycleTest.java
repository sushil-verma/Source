package owner.mytest;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by sushil on 22-11-2018.
 */

public class FragmentLifeCycleTest extends Fragment {
    View v;
    @Override
    public void setRetainInstance(boolean retain) {
        super.setRetainInstance(retain);
        Log.i("1", "setRetainInstance");

    }


    @Override
    public LayoutInflater getLayoutInflater(Bundle savedFragmentState) {
        return super.getLayoutInflater(savedFragmentState);
    }

    @Override
    public void setHasOptionsMenu(boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
        Log.i("2", "hasmenu");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.i("3", "onAttachFragment");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("4", "onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("5", "onCreate");

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      //  LayoutInflater lainf=(LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //  LayoutInflater layoutInflater=getLayoutInflater();
         super.onCreateView(inflater, container, savedInstanceState);
        Log.i("tag", "onCreateVIew ");

        v = inflater.inflate(R.layout.activity_main, null);

        if (savedInstanceState != null) {
            String str=savedInstanceState.getString("data");

            ((EditText) v.findViewById(R.id.edittext)).setText(str);
        }
       // setRetainInstance(true);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("6", "onViewCreated");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("7", "onActivityCreated");

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i("8", "onViewStateRestored");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("9", "onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("10", "onResume");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("11", "onSaveInstanceState");
        String str=((EditText)v.findViewById(R.id.edittext)).getText().toString();
        outState.putString("data",str);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("12", "onConfigurationChanged");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("13", "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("14", "onStop");

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i("15", "onLowMemory");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("16", "onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("17", "onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("18", "onDetach");

    }
}
