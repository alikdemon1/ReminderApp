package kz.alisher.reminder.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import kz.alisher.reminder.fragment.AbstractTabFragment;
import kz.alisher.reminder.fragment.BirthdayFragment;
import kz.alisher.reminder.fragment.HistoryFragment;
import kz.alisher.reminder.fragment.IdeasFragment;
import kz.alisher.reminder.fragment.TodoFragment;

/**
 * Created by Alisher Kozhabay on 25.05.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context ctx;

    public TabsPagerFragmentAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        this.ctx = ctx;
        initTabsMap(ctx);
    }

    private void initTabsMap(Context ctx) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(ctx));
        tabs.put(1, IdeasFragment.getInstance(ctx));
        tabs.put(2, TodoFragment.getInstance(ctx));
        tabs.put(3, BirthdayFragment.getInstance(ctx));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
       return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
