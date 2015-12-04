package carrillo.uriel.wallpaper;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public  class ImageAdapter  extends BaseAdapter{
    //keep all images in array
    private Context mContext;
    public Integer[] mThumbIds ={
            R.drawable.pic_1,R.drawable.pic_2,
            R.drawable.pic_3,R.drawable.pic_4,
            R.drawable.pic_5,R.drawable.pic_6,
            R.drawable.pic_7,R.drawable.pic_8,
            R.drawable.pic_9
    };


    //constructor
    public ImageAdapter(Context c){
        mContext=c;
    }

    @Override
    public int getCount(){
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(ViewPager.LayoutParams.WRAP_CONTENT, 200));
        return imageView;
    }
}
