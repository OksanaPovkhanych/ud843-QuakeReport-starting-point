package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

        private double magnitude;
        private String place;
        private long date;
        private String url;

        public Earthquake(double mMagnitude, String mPlace, long mDate, String mUrl)
        {
            magnitude = mMagnitude;
            place = mPlace;
            date = mDate;
            url = mUrl;
        }

      public double getMagnitude() {
            return magnitude;
        }

        public String getUrl() {
            return url;
        }

        public String getPlace() {
            return place;
        }

        public long getDate() {
            return date;
        }

  }
