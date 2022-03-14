package com.example.lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Food> listfood;
    private int positionSelect = -1;

    public FoodAdapter(Context context, int idLayout, List<Food> listfood) {
        this.context = context;
        this.idLayout = idLayout;
        this.listfood = listfood;
    }

    @Override
    public int getCount() {
        if (listfood.size()!=0 && !listfood.isEmpty()) {
            return listfood.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }
        TextView tvname = view.findViewById(R.id.textViewname);
        TextView tvde = view.findViewById(R.id.textViewde);
        TextView tvpri = view.findViewById(R.id.textViewpri);
        ImageView imvfood = view.findViewById(R.id.imvfood);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.ct);
        final Food food = listfood.get(i);

        if(listfood!=null&&!listfood.isEmpty()){
            tvname.setText(food.getName());
            tvde.setText(food.getDecription());
            tvpri.append(""+food.getPrice());
            int idfood = food.getId();
            switch (idfood){
                case 1:
                    imvfood.setImageResource(R.mipmap.donut_yellow);
                    break;
                case 2:
                    imvfood.setImageResource(R.mipmap.tasty_donut);
                    break;
                case 3:
                    imvfood.setImageResource(R.mipmap.green_donut);
                    break;
                case 4:
                    imvfood.setImageResource(R.mipmap.donut_red);
                    break;
                default:
                    break;
            }
        }

        return view;
    }
}
