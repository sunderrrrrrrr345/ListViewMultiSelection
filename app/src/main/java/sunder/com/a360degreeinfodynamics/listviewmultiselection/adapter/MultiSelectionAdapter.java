package sunder.com.a360degreeinfodynamics.listviewmultiselection.adapter;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import sunder.com.a360degreeinfodynamics.listviewmultiselection.R;
import sunder.com.a360degreeinfodynamics.listviewmultiselection.pogo.Product;

/**
 * Created by Admin on 9/11/2017.
 */

public class MultiSelectionAdapter<Product> extends BaseAdapter {

    Context mContext;


    LayoutInflater mInflater;


    ArrayList<Product> mList;


    SparseBooleanArray mSparseBooleanArray;


    public MultiSelectionAdapter(Context context, ArrayList<Product> list) {


        // TODO Auto-generated constructor stub


        this.mContext = context;


        mInflater = LayoutInflater.from(mContext);


        mSparseBooleanArray = new SparseBooleanArray();


        mList = new ArrayList<Product>();


        this.mList = list;




    }

    @Override
    public int getCount() {
        //Toast.makeText(mContext, "Selected Items: " + mList.size(), Toast.LENGTH_SHORT).show();
        return mList.size();

    }

    @Override
    public Object getItem(int position) {
      //  Toast.makeText(mContext, "Selected Items: " + mList.get(position), Toast.LENGTH_SHORT).show();
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // TODO Auto-generated method stub


        if(convertView == null) {


            convertView = mInflater.inflate(R.layout.row, null);




        }


        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);


        tvTitle.setText(mList.get(position).toString());




        CheckBox mCheckBox = (CheckBox) convertView.findViewById(R.id.chkEnable);


        mCheckBox.setTag(position);


        mCheckBox.setChecked(mSparseBooleanArray.get(position));


        mCheckBox.setOnCheckedChangeListener(mCheckedChangeListener);


        return convertView;
    }



  public ArrayList<Product> getCheckedItems() {


        ArrayList<Product> mTempArry = new ArrayList<Product>();


        for (int i = 0; i < mList.size(); i++) {


            if (mSparseBooleanArray.get(i)) {


                mTempArry.add(mList.get(i));


            }

        }
        return mTempArry;
    }

   CompoundButton.OnCheckedChangeListener mCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {




        @Override


        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            // TODO Auto-generated method stub


            mSparseBooleanArray.put((Integer) buttonView.getTag(), isChecked);


        }


    };
}
