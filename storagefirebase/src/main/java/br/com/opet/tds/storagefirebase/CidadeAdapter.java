package br.com.opet.tds.storagefirebase;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CidadeAdapter extends ArrayAdapter<Uri> {

    private int rId;

    public CidadeAdapter(Context context, int resource, List<Uri> objects) {
        super(context, resource, objects);
        rId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View mView = convertView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Uri image_link = getItem(position);

        ImageView img = mView.findViewById(R.id.imageDownload);
        TextView local = mView.findViewById(R.id.local);
        TextView cidade = mView.findViewById(R.id.cidade);
        TextView estado = mView.findViewById(R.id.estado);

        Picasso.get().load(image_link).into(img);
        local.getText().toString();
        cidade.getText().toString();
        estado.getText();toString();

        return mView;
    }

}
