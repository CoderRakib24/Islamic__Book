package com.coderfaysal.islamicbook;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    LinearLayout layNonet, layRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        layNonet = findViewById(R.id.layNonet);
        layRoot = findViewById(R.id.layRoot);



        hashMap = new HashMap<>();
        hashMap.put("title", "ধৈর্য হারাবেন না");
        hashMap.put("image_url", "https://i.ibb.co/34c8n5J/Screenshot-9.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1_r5hXztRAjdPbllHm0Ktjqo73IoXaQv1/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "প্যারাডক্সিক্যাল সাজিদ");
        hashMap.put("image_url", "https://i.ibb.co/p1jBSgT/Screenshot-10.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1_N-FMFj1DsBJfaSmjtA7NrGdcfTylHTY/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "প্যারাডক্সিক্যাল সাজিদ ২");
        hashMap.put("image_url", "https://i.ibb.co/Db237YP/Screenshot-11.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1PnFLPRyi21fSitBylZCGamijkoZoQIWe/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "লাভ ক্যান্ডি");
        hashMap.put("image_url", "https://i.ibb.co/VpgDgdc/Screenshot-22.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1OwyBnfdO9CORXNcZ-LjGB_lpqiAZdJHj/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সচ্চরিত্রতা ও চারিত্রিক গুণাবলী");
        hashMap.put("image_url", "https://i.ibb.co/pjnnBcp/Screenshot-23.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1xwYEUKvOPqg219lTO2EKCYKlj7dHrjz3/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "তালবীসুল ইবলিস- শয়তানের ধোঁকা");
        hashMap.put("image_url", "https://i.ibb.co/1bJgCmd/Screenshot-24.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1ncNCs4DAHEOtMD1fGhzjoJhTRyb7I3rw/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "পোশাক পর্দা ও দেহ সজ্জা");
        hashMap.put("image_url", "https://i.ibb.co/pnjvqB9/Screenshot-25.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1wi8oJS1o85Ap91wSyWBOdMLImOSUwytD/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কারা জান্নাতী কুমারীদের ভালোবাসে");
        hashMap.put("image_url", "https://i.ibb.co/9qbWm1Q/Screenshot-1.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1xndY6DD-zR374l0NoGybEJG7-JS7k1BP/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ইসলামী বিবাহ");
        hashMap.put("image_url", "https://i.ibb.co/6wmbBJ2/Screenshot-2.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/18QRk228igQbq3eoM2G_5RwENdqO5naLX/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "আত্মশুদ্ধি");
        hashMap.put("image_url", "https://i.ibb.co/7Cx3qdV/Screenshot-3.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1QLIQlklRMD0iER5R5rgX3rgk0aRlmczA/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "অন্তরের রোগ");
        hashMap.put("image_url", "https://i.ibb.co/NnnwJMg/Screenshot-4.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/13-GH1I5rT2tO5zl9x0o3F99pgJd8xkBe/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কুরআন ও হাদিসের আলোকে বিয়ে");
        hashMap.put("image_url", "https://i.ibb.co/XtLP4Qq/Screenshot-5.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1Vi5Wt69W3gZq25wc3CcGiAQe5dyPX5Cw/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জন্ম নিয়ন্ত্রণ ইসলাম ও যুক্তির নিরিখে");
        hashMap.put("image_url", "https://i.ibb.co/0Xr61zP/Screenshot-6.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1l88WCeR2EC0YunTGHJTd9NRxaLIVM9YN/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "তাকওয়া");
        hashMap.put("image_url", "https://i.ibb.co/nwwhrHt/Screenshot-7.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1gWT_pS3g-cmrVmZ_OhNyRchBsR8lEzSW/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দাউস কখনো জান্নাতে প্রবেশ করবে না");
        hashMap.put("image_url", "https://i.ibb.co/Q6fpFB1/Screenshot-8.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1xtjgHXPkddEo8XIZQ_GKKky41jeCzvMI/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "প্রত্যাবর্তন");
        hashMap.put("image_url", "https://i.ibb.co/Jy4YXwP/Screenshot-12.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1mmgCXjIZluj8nvmqUizu-frf3dZu99NI/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বেলা ফুরাবার আগে");
        hashMap.put("image_url", "https://i.ibb.co/HtNv8mW/Screenshot-35.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/11S-WiFx4SB_hBf29Y1Pb_a4KJtV8MLDU/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "প্রশান্তির খোঁজে");
        hashMap.put("image_url", "https://i.ibb.co/dcs62FR/Screenshot-13.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1xz_2_QgfI0S1AFvkm3QqumbLQ79iOtgs/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বিপদ যখন নিয়ামত");
        hashMap.put("image_url", "https://i.ibb.co/fr28NPb/Screenshot-14.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/17q-SkCXuw5dL9GnPYM4cus3POWrUD42u/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বিবাহ একটি উত্তম বন্ধুত্ব");
        hashMap.put("image_url", "https://i.ibb.co/SxdXsDp/Screenshot-15.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1jT511yxG4LTRb7oqn5U8qgOgUtbY29Xv/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বিয়ের উপহার");
        hashMap.put("image_url", "https://i.ibb.co/Nm1htPZ/Screenshot-16.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1k4ffxyrbAFcblMr_fFuvq-hmO2DR4CL8/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বিশ্বাসের যৌক্তিকতা");
        hashMap.put("image_url", "https://i.ibb.co/stsc91y/Screenshot-17.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/14TxIJ4by79dQ86mMalzYzWRYjTEDPsB6/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "মা মা ও বাবা – আরিফ আজাদ");
        hashMap.put("image_url", "https://i.ibb.co/cQ7CJMd/Screenshot-18.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1svJcT-etCw6QPBq_j4SBFEPeEqb8jFVY/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ম্যাসেজ - Massage");
        hashMap.put("image_url", "https://i.ibb.co/VmR3HC0/Screenshot-19.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1OlXAPQ5In3hiU1v-foxxF8Dz_kgtVZWe/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "রমাদান তৃষাতুর অপেক্ষা");
        hashMap.put("image_url", "https://i.ibb.co/tcDqPzx/Screenshot-20.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1bOS-Pz8xExtpOsHN_1L4f-oxRCy0QaoE/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "রমাদান প্ল্যানার");
        hashMap.put("image_url", "https://i.ibb.co/7vX26Jr/Screenshot-21.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1g5IHs40Hcl4TfVzZGrVUISvWnq2H5UKV/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "অন্য পথের কন্যারা");
        hashMap.put("image_url", "https://i.ibb.co/fk4r0Gn/Screenshot-26.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1fbV9qBAONL7V5l9-HdIJ5U8fjm_hTW2T/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "আল্লাহুম্মা বাল্লিগনা রমযান");
        hashMap.put("image_url", "https://i.ibb.co/qNPszcQ/Screenshot-27.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1Q6uEhAHxXcMydJgp4wUNCccdHG9CU6x8/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "এসো তওবার পথে");
        hashMap.put("image_url", "https://i.ibb.co/6w1MX5R/Screenshot-28.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1Bq1bbG8KYur_tGiqCz5cGC7aAuWfnZNv/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নবীজি যেমন ছিলেন");
        hashMap.put("image_url", "https://i.ibb.co/DDcS7pj/Screenshot-30.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1dcKlUz_6bLzFzfovySyxRwRMaeljdVGZ/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ষাড়নামা - আরিফ আজাদ");
        hashMap.put("image_url", "https://i.ibb.co/sKVpKzR/Screenshot-33.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/18Nn5eu7CUk9xrrnlmtOiVGYJQkMCHGYq/preview");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "আরজ আলী সমীপে");
        hashMap.put("image_url", "https://i.ibb.co/6yNcZmw/Screenshot-34.png");
        hashMap.put("pdf_url", "https://drive.google.com/file/d/1J9SZ85PSA6l2R6g_mp61pIa5EcWiCB4g/preview");
        arrayList.add(hashMap);





        BookAdapter bookAdapter = new BookAdapter();
        gridView.setAdapter(bookAdapter);


        if(!isNetworkAvailable(MainActivity.this)){
            layRoot.setVisibility(View.GONE);
            layNonet.setVisibility(View.VISIBLE);
        }else{
            layRoot.setVisibility(View.VISIBLE);
            layNonet.setVisibility(View.GONE);
        }

    }

    public static boolean isNetworkAvailable(Context context) {
        return ((ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE))
                .getActiveNetworkInfo() != null;
    }

    public class BookAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View bookView = layoutInflater.inflate(R.layout.item5, parent, false);


            HashMap<String, String> hashMap = arrayList.get(position);
            String tvTitle =  hashMap.get("title");
            String tvImage =  hashMap.get("image_url");
            String tvPdf =  hashMap.get("pdf_url");

            ImageView imageView = bookView.findViewById(R.id.imageView);
            CardView items = bookView.findViewById(R.id.items);
            TextView bookName = bookView.findViewById(R.id.bookName);

            Picasso.get().load(tvImage).placeholder(R.drawable.placeholder).error(R.drawable.placeholder).into(imageView);
            bookName.setText(tvTitle);

            items.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LoadPDF.WEBSITE_LINK = tvPdf;
                    LoadPDF.TITLE = tvTitle;
                    startActivity(new Intent(MainActivity.this, LoadPDF.class));
                }
            });



            return bookView;
        }
    }



}