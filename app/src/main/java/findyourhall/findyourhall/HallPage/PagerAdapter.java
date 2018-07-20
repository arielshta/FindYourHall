package findyourhall.findyourhall.HallPage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;
    public PagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numberOfTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DescriptionFragment descriptionFragment = new DescriptionFragment();
                return descriptionFragment;
//            case 1:
//                ReviewFragment reviewFragment = new ReviewFragment();
//                return reviewFragment;
            case 2:
                HallPicturesFragment hallPicturesFragment = new HallPicturesFragment();
                return hallPicturesFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
