package com.inducesmile.androidnestedscrollview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    public ImageView productImage;
    public TextView productName;

    public ProductViewHolder(View itemView) {
        super(itemView);
        productImage = (ImageView)itemView.findViewById(R.id.product_image);
        productName = (TextView)itemView.findViewById(R.id.product_name);
    }
}