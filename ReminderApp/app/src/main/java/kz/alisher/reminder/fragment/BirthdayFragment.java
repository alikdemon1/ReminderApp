package kz.alisher.reminder.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kz.alisher.reminder.R;

/**
 * Created by Alisher Kozhabay on 25.05.2016.
 */
public class BirthdayFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);
        fragment.setCtx(context);
        fragment.setTitle(context.getString(R.string.tab_bithdays));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }

}
