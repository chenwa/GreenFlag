package com.example.greenflag;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class UserViewHolder extends RecyclerView.ViewHolder {

    // TODO: get user Image to change
    //ImageView userImage;
    private TextView tvName;
    private TextView tvUserName;
    private TextView tvPostal;
    private TextView tvCountry;
    private TextView tvGender;
    private TextView tvBirthday;
    private TextView tvAge;

    UserViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.user_name);
        tvUserName = itemView.findViewById(R.id.user_user_name);
        tvPostal = itemView.findViewById(R.id.user_postal);
        tvCountry = itemView.findViewById(R.id.user_country);
        tvGender = itemView.findViewById(R.id.user_gender);
        tvBirthday = itemView.findViewById(R.id.user_birthday);
        tvAge = itemView.findViewById(R.id.user_age);
    }

    // Fill the layout using User object given by Adapter
    void onBind(User user) {
        tvName.setText(user.getName());
        tvUserName.setText(user.getUserName());
        tvPostal.setText(user.getPostal());
        tvCountry.setText(user.getCountry());
        tvGender.setText(user.getGender());
        tvBirthday.setText(user.getBirthday());
        tvAge.setText(user.getAge());
    }
}
