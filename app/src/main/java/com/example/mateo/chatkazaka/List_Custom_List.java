package com.example.mateo.chatkazaka;

/**
 * Created by Mateo on 17.01.2018.
 */


        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

public class List_Custom_List extends BaseAdapter {

    private Context ctx;
    private String[] data;

    public List_Custom_List(Context ctx, String[] importeddata) {
        this.data = importeddata;
        this.ctx = ctx;
    }

    public int getCount() {
        return data.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolderPattern {
        TextView tekst_w_layoucie;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderPattern view_holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout, parent, false);

            view_holder = new ViewHolderPattern();
            view_holder.tekst_w_layoucie = (TextView) convertView.findViewById(R.id.textView_item_custom);

            convertView.setTag(view_holder);
        } else {
            view_holder = (ViewHolderPattern) convertView.getTag();
        }

        view_holder.tekst_w_layoucie.setText(data[position]);

        return convertView;
    }

}