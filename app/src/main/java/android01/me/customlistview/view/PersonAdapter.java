package android01.me.customlistview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import android01.me.customlistview.R;
import android01.me.customlistview.model.Person;

/**
 * Created by mohammad on 06/10/14.
 */
public class PersonAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Person> persons;

    public PersonAdapter(Context mContext, ArrayList<Person> persons) {
        this.mContext = mContext;
        this.persons = persons;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int i) {
        return persons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    public static class ViewHolder {
        ImageView mImageView;
        TextView mTextViewTitle;
        TextView mTextViewName;

    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder mViewHolder = null;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_person, null);
            mViewHolder = new ViewHolder();
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.mImageView = (ImageView) convertView.findViewById(R.id.img_person);
        mViewHolder.mTextViewName = (TextView) convertView.findViewById(R.id.tv_name_person);
        mViewHolder.mTextViewTitle = (TextView) convertView.findViewById(R.id.tv_title_person);

        Person person = (Person) getItem(i);

        Picasso.with(mContext)
                .load(person.getImage())
                .placeholder(R.drawable.default_person)
                .error(R.drawable.default_person)
                .into(mViewHolder.mImageView);
        mViewHolder.mTextViewName.setText(person.getName());
        mViewHolder.mTextViewTitle.setText(person.getTitle());
        return convertView;
    }
}
