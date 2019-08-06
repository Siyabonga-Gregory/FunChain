package com.weebly.ghostcoder.funchain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by Greg on 2018/05/14.
 */

public class Photos extends Fragment
{
    View view;
    public Photos()
    {}

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle)
    {
        view=inflater.inflate(R.layout.photos,viewGroup,false);
        return view;
    }
}
