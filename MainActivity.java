package mx.com.talentics.ahorcadotalentics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView txt_inicial;
    Button btn_anular;
    Button btn_incluirBD;
    Button btn_completar;
    Button btn_decifrar;
    Button btn_letras;
    Button btn_rimas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_inicial = (TextView) findViewById(R.id.txt_inicial);
        btn_anular = (Button) findViewById(R.id.btn_anular);
        btn_incluirBD = (Button) findViewById(R.id.btn_incluirBD);
        btn_completar = (Button) findViewById(R.id.btn_completar);
        btn_decifrar = (Button) findViewById(R.id.btn_decifrar);
        btn_letras = (Button) findViewById(R.id.btn_letras);
        btn_rimas = (Button) findViewById(R.id.btn_rimas);

        btn_anular.setOnClickListener(this);
        btn_incluirBD.setOnClickListener(this);
        btn_completar.setOnClickListener(this);
        btn_decifrar.setOnClickListener(this);
        btn_letras.setOnClickListener(this);
        btn_rimas.setOnClickListener(this);

    }

    @Override
    public void onClick(View V) {
        switch(V.getId()){
            case R.id.btn_anular:
                txt_inicial.setText("Botón para anular");
                break;
            case R.id.btn_incluirBD:
                txt_inicial.setText("Botón para incluir Base de Datos");
                break;
            case R.id.btn_completar:
                Intent i = new Intent(this, completar.class);
                startActivity(i);
                break;
            case R.id.btn_decifrar:
                Intent j = new Intent(this, decifrar.class);
                startActivity(j);
                break;
            case R.id.btn_letras:
                Intent k = new Intent(this, letras.class);
                startActivity(k);
                break;
            case R.id.btn_rimas:
                Intent l = new Intent(this, rimas.class);
                startActivity(l);
                break;

        }
    }
}
