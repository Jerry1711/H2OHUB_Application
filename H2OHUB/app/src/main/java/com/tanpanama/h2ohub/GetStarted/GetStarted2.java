package com.tanpanama.h2ohub.GetStarted;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanpanama.h2ohub.Data.UserData;
import com.tanpanama.h2ohub.R;
import com.tanpanama.h2ohub.StepView.StepView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GetStarted2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GetStarted2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View v;

    public GetStarted2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GetStarted2.
     */
    // TODO: Rename and change types and number of parameters
    public static GetStarted2 newInstance(String param1, String param2) {
        GetStarted2 fragment = new GetStarted2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_get_started2, container, false);

        StepView fs = new StepView(6);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.StepView_Container, fs).commit();

        GetStarted2_1 gs = new GetStarted2_1();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.Inner_Container, gs).commit();

        return v;
    }
}