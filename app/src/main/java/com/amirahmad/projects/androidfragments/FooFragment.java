package com.amirahmad.projects.androidfragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.lang.reflect.Array;

/**
 * Created by Amirahmad Adibi.
 * AndroidFragments | Copyrights 2019-07-24.
 */

public class FooFragment extends Fragment {

    // onAttach() *** is called when a fragment is connected to an activity.
    // onCreate() *** is called to do initial creation of the fragment.
    // onCreateView() *** is called by Android once the Fragment should inflate a view.
    // onViewCreated() *** is called after onCreateView() and ensures that the fragment's root view is non-null. Any view setup should happen here. E.g., view lookups, attaching listeners.
    // onActivityCreated() *** is called when host activity has completed its onCreate() method.
    // onStart() *** is called once the fragment is ready to be displayed on screen.
    // onResume() *** Allocate “expensive” resources such as registering for location, sensor updates, etc.
    // onPause() *** Release “expensive” resources. Commit any changes.
    // onDestroyView() *** is called when fragment's view is being destroyed, but the fragment is still kept around.
    // onDestroy() *** is called when fragment is no longer in use.
    // onDetach() *** is called when fragment is no longer connected to the activity.

    public static final String TAG = "fragmentLifecycle";
    String[] usernames = {"amirahmda","reza","ali","mohamd","alireza","mohammad","reza","taghi","reza","ali","amin","iman","soltan"};
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
    }

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_foo,container,false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        ListView listView = view.findViewById(R.id.fragmentFooListView);
        ArrayAdapter<String>  stringArrayAdapter = new ArrayAdapter<String>
                (view.getContext(),android.R.layout.simple_list_item_1,usernames);

        listView.setAdapter(stringArrayAdapter);
    }

    // This method is called after the parent Activity's onCreate() method has completed.
    // Accessing the view hierarchy of the parent activity must be done in the onActivityCreated.
    // At this point, it is safe to search for activity View objects by their ID, for example.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    // This method is called when the fragment is no longer connected to the Activity
    // Any references saved in onAttach should be nulled out here to prevent memory leaks.
    @Override
    public void onDetach() {
        super.onDetach();

    }
}
