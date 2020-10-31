package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {


    private String mWeatherData[];


    @Override
    public ForecastAdapterViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.forecast_list_item,parent,false);
        ForecastAdapterViewHolder viewHolder=new ForecastAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ForecastAdapterViewHolder holder, int position) {

        holder.mWeatherTextView.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        if(mWeatherData==null)
        return 0;
        return  mWeatherData.length;
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        private TextView mWeatherTextView;
        public ForecastAdapterViewHolder( View itemView) {
            super(itemView);
            mWeatherTextView=itemView.findViewById(R.id.tv_weather_data);
        }
    }

    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}
