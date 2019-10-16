package edu.temple.lab4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String colors[];
    Resources resources;

    public ColorAdapter (Context context, String colors [], Resources res){
        this.context = context;
        this.resources = res;
        this.colors = colors;
        //String[] gridLabels = resources.getStringArray(R.array.string_array_name);//resources.getStringArray(R.array.string_array_name);
      //String colors [] = this.getResources().getStringArray(R.array.string_array_name);
    }

    @Override
    public int getCount() {

        return colors.length;
    }

    @Override
    public Object getItem(int i) {

        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String colorValue = colors[i];
        textView.setText(colorValue);
        if (colorValue.equals("Red") || colorValue.equals("Rojo")) {
            textView.setBackgroundColor(Color.RED);
        } else if (colorValue.equals("Green") || colorValue.equals("Verde")) {
            textView.setBackgroundColor(Color.GREEN);
        } else if (colorValue.equals("Blue") || colorValue.equals("Azul")) {
            textView.setBackgroundColor(Color.BLUE);
        } else if (colorValue.equals("Yellow") || colorValue.equals("Amarilla")) {
            textView.setBackgroundColor(Color.YELLOW);
        } else if (colorValue.equals("Purple") || colorValue.equals("púrpura")) {
            textView.setBackgroundColor(Color.parseColor("Purple"));
        }else if(colorValue.equals("Gray") || colorValue.equals("gris")) {
            textView.setBackgroundColor(Color.GRAY);
        }else if(colorValue.equals("Orange") || colorValue.equals("naranja")) {
            textView.setBackgroundColor(Color.rgb(255, 165, 0));
        }else if(colorValue.equals("Brown") || colorValue.equals("marrón")) {
            textView.setBackgroundColor(Color.rgb(139, 69, 19));
        } else if(colorValue.equals("Pink") || colorValue.equals("Rosado")) {
            textView.setBackgroundColor(Color.rgb(255,105,180));
        }else if(colorValue.equals("Teal") || colorValue.equals("Verde azulado")){
            textView.setBackgroundColor(Color.parseColor("Teal"));
        }
        return textView;
    }
}
