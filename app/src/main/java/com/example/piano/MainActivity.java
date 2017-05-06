package com.example.piano;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.piano.R.raw.a1;
import static com.example.piano.R.raw.a1s;
import static com.example.piano.R.raw.b1;
import static com.example.piano.R.raw.c1;
import static com.example.piano.R.raw.c1s;
import static com.example.piano.R.raw.c2;
import static com.example.piano.R.raw.d1;
import static com.example.piano.R.raw.d1s;
import static com.example.piano.R.raw.e1;
import static com.example.piano.R.raw.f1;
import static com.example.piano.R.raw.f1s;
import static com.example.piano.R.raw.g1;
import static com.example.piano.R.raw.g1s;

public class MainActivity extends AppCompatActivity
{
    Button play,stop;
    EditText et;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play);
        stop=(Button)findViewById(R.id.stop);
        et=(EditText)findViewById(R.id.edittext);

        mediaPlayer=new MediaPlayer();

        et.setText("E1 . C1 D1 . . C1 D1 E1 . . C1 D1 . .");

        stop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Stop","Stop is pressed");
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }

            }
        });

        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                stop.setEnabled(true);
                stop.setClickable(true);

                StringTokenizer st= new StringTokenizer(et.getText().toString().toLowerCase()," ");
                int tokens=st.countTokens();

                String notes[]=new String[tokens];



                for(int i=0;i<tokens;i++)
                {
                    notes[i]=st.nextToken();
                    switch(notes[i])
                    {
                        case "a1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a1);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a1);
                                mediaPlayer.start();
                            }


                            break;
                        case "a1s":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a1s);

                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a1s);

                                mediaPlayer.start();
                            }


                            break;
                        case "b1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.b1);

                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.b1);

                                mediaPlayer.start();
                            }


                            break;
                        case "c1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c1);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c1);
                                mediaPlayer.start();
                            }

                            break;
                        case "c1s":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c1s);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c1s);
                                mediaPlayer.start();
                            }


                            break;

                        case "c2":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c2);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.c2);
                                mediaPlayer.start();
                            }


                            break;
                        case "d1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.d1);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.d1);
                                mediaPlayer.start();
                            }


                            break;
                        case "d1s":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.d1s);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.d1s);
                                mediaPlayer.start();
                            }


                            break;
                        case "e1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e1);
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e1);
                            }

                            mediaPlayer.start();


                            break;
                        case "f1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.f1);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.f1);
                                mediaPlayer.start();
                            }


                            break;
                        case "f1s":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.f1s);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.f1s);
                                mediaPlayer.start();
                            }


                            break;
                        case "g1":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g1);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g1);
                                mediaPlayer.start();
                            }


                            break;
                        case "g1s":
                            if (!mediaPlayer.isPlaying())
                            {
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g1s);
                                mediaPlayer.start();
                            }
                            else
                            {
                                while(mediaPlayer.isPlaying())
                                {

                                }
                                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.g1s);
                                mediaPlayer.start();
                            }

                            break;
                        case ".":
                            try
                            {
                                TimeUnit.MILLISECONDS.sleep(50);
                            } catch (InterruptedException e)
                            {
                                Toast.makeText(getBaseContext(),"exception encountered",Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                            break;

                        default:
                            Toast.makeText(getBaseContext(),notes[i]+": Invalid input",Toast.LENGTH_SHORT).show();

                    }
                }


            }
        });

    }


    @Override
    protected void onPause()
    {
        super.onPause();
        mediaPlayer.release();
        mediaPlayer=null;

    }
}
