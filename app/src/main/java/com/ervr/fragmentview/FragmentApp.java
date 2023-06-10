package com.ervr.fragmentview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ervr.fragmentview.databinding.FragmentAppBinding;

public class FragmentApp extends Fragment {
    private FragmentAppBinding mBinding;

    public FragmentApp() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentAppBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }


    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int index = mBinding.radiogroup.indexOfChild(mBinding.radiogroup.findViewById(i));
                switch (index) {
                    case 0:
                        mBinding.TextviewRes.setText("¡Sí, lo conozco!");
                        break;

                    case 1:
                        mBinding.TextviewRes.setText("No ... buu...");
                        break;
                    default:
                        break;
                }
            }
        });

    }
}