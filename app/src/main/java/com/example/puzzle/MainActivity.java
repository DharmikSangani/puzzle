package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] b = new Button[9];
    Button restart;
    TextView dis;
    ArrayList list=new ArrayList();
    int counter=0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dis=findViewById(R.id.display);
        restart=findViewById(R.id.restart);


        for (int i=0;i<b.length;i++){
            int id=getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i]=findViewById(id);
            b[i].setOnClickListener(this);
            restart.setOnClickListener(this);
        }
        resetButtons();
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                list.clear();
                resetButtons();
            }
        });

    }

    private void resetButtons()
    {
       
        list.clear();
        counter=0;
        while (counter<9)
        {
            int min=1,max=10;
            int r = new Random().nextInt(max-min)+min;//9
            if(list.isEmpty())
            {
                list.add(r);
                counter++;
            }
            if(!list.contains(r))
            {
                list.add(r);
                counter++;


            }
            System.out.println("Count="+counter);
        }
        System.out.println("List="+list);

        for (int i=0;i<list.size();i++)
        {
            if (list.get(i).equals(9))
            {
                b[i].setText("");
            }
            else
            {
                b[i].setText(""+list.get(i));
            }

        }
    }

    @Override
    public void onClick(View view) {


        if (view.getId() == b[0].getId()) {
            if (b[1].getText().toString().isEmpty()) {
                b[1].setText("" + b[0].getText().toString());
                b[0].setText("");
                win();
            }
            if (b[3].getText().toString().isEmpty()) {
                b[3].setText("" + b[0].getText().toString());
                b[0].setText("");
                win();
            }

        }



        if (view.getId() == b[1].getId()) {
            if (b[0].getText().toString().isEmpty()) {
                b[0].setText("" + b[1].getText().toString());
                b[1].setText("");
                win();
            }
            if (b[2].getText().toString().isEmpty()) {
                b[2].setText("" + b[1].getText().toString());
                b[1].setText("");
                win();
            }
            if (b[4].getText().toString().isEmpty()) {
                b[4].setText("" + b[1].getText().toString());
                b[1].setText("");
                win();
            }

        }



        if (view.getId() == b[2].getId()) {
            if (b[1].getText().toString().isEmpty()) {
                b[1].setText("" + b[2].getText().toString());
                b[2].setText("");
                win();
            }
            if (b[5].getText().toString().isEmpty()) {
                b[5].setText("" + b[2].getText().toString());
                b[2].setText("");
                win();
            }

        }



        if (view.getId() == b[3].getId()) {
            if (b[0].getText().toString().isEmpty()) {
                b[0].setText("" + b[3].getText().toString());
                b[3].setText("");
                win();
            }
            if (b[4].getText().toString().isEmpty()) {
                b[4].setText("" + b[3].getText().toString());
                b[3].setText("");
                win();
            }
            if (b[6].getText().toString().isEmpty()) {
                b[6].setText("" + b[3].getText().toString());
                b[4].setText("");
                win();
            }

        }



        if (view.getId() == b[4].getId()) {
            if (b[1].getText().toString().isEmpty()) {
                b[1].setText(""+b[4].getText().toString());
                b[4].setText("");
                win();
            }
            if (b[3].getText().toString().isEmpty()) {
                b[3].setText(""+b[4].getText().toString());
                b[4].setText("");
                win();
            }
            if (b[5].getText().toString().isEmpty()) {
                b[5].setText(""+b[4].getText().toString());
                b[4].setText("");
                win();
            }
            if (b[7].getText().toString().isEmpty()) {
                b[7].setText(""+b[4].getText().toString());
                b[4].setText("");
                win();
            }

        }



        if (view.getId() == b[5].getId()) {
            if (b[2].getText().toString().isEmpty()) {
                b[2].setText("" + b[5].getText().toString());
                b[5].setText("");
                win();
            }
            if (b[4].getText().toString().isEmpty()) {
                b[4].setText("" + b[5].getText().toString());
                b[5].setText("");
                win();
            }
            if (b[8].getText().toString().isEmpty()) {
                b[8].setText("" + b[5].getText().toString());
                b[5].setText("");
                win();
            }

        }

        if (view.getId() == b[6].getId()) {
            if (b[3].getText().toString().isEmpty()) {
                b[3].setText("" + b[6].getText().toString());
                b[6].setText("");
                win();
            }
            if (b[7].getText().toString().isEmpty()) {
                b[7].setText("" + b[6].getText().toString());
                b[6].setText("");
                win();
            }

        }



        if (view.getId() == b[7].getId()) {
            if (b[6].getText().toString().isEmpty()) {
                b[6].setText("" + b[7].getText().toString());
                b[7].setText("");
                win();
            }
            if (b[4].getText().toString().isEmpty()) {
                b[4].setText("" + b[7].getText().toString());
                b[7].setText("");
                win();
            }
            if (b[8].getText().toString().isEmpty()) {
                b[8].setText("" + b[7].getText().toString());
                b[7].setText("");
                win();
            }

        }



        if (view.getId() == b[8].getId()) {
            if (b[5].getText().toString().isEmpty()) {
                b[5].setText("" + b[8].getText().toString());
                b[8].setText("");
                win();
            }
            if (b[7].getText().toString().isEmpty()) {
                b[7].setText("" + b[8].getText().toString());
                b[8].setText("");
                win();
            }

        }
    }


    private void win() {
        if (b[0].getText().toString().equals("1") && b[1].getText().toString().equals("2") && b[2].getText().toString().equals("3") && b[3].getText().toString().equals("4") && b[4].getText().toString().equals("5") && b[5].getText().toString().equals("6") && b[6].getText().toString().equals("7") && b[7].getText().toString().equals("8")&&b[8].getText().toString().isEmpty()){
            dis.setText("\uD835\uDD50\uD835\uDD46\uD835\uDD4C \uD835\uDD38ℝ\uD835\uDD3C \uD835\uDD4E\uD835\uDD40ℕ");
            disabled();
        }
    }

    private void disabled() {
        for (int i = 0; i < b.length; i++) {
            b[i].setEnabled(false);
        }
    }

}