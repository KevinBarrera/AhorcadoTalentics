package mx.com.talentics.ahorcadotalentics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView txt_inicial;
    Button btn_1;
    Button btn_2;
    Button btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_inicial = (TextView) findViewById(R.id.txt_inicial);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View V) {
        switch(V.getId()){
            case R.id.btn_1:
                txt_inicial.setText("Usaste boton Yoc");
                break;
            case R.id.btn_2:
                txt_inicial.setText("Usaste boton 2");
                break;
            case R.id.btn_3:
                txt_inicial.setText("Usaste boton 3");
                break;
        }
    }
}
