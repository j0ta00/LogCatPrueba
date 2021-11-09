package es.iesnervion.juanjomz.logcatprueba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPause,btnResume,btnContador;
    private final String ACTIVITY_MAIN="ActivityMain";
    private final String CONTADORKEY="ContadorKey";
    private int i=0;
    @Override
    protected void onCreate(Bundle icicle){
        if (icicle != null){ //Recupero el valor del contador mediante el uso del estado de la instancia guardado gracias onSaveInstanceState
           i = icicle.getInt(CONTADORKEY);
        }
        Log.i(ACTIVITY_MAIN,"OnCreate executing");
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        btnContador=findViewById(R.id.btnContador);
        btnContador.setOnClickListener(x->aumentarContador());
    }
    public void aumentarContador(){
        i++;
        Log.i(ACTIVITY_MAIN,String.valueOf(i));
    }
    @Override
    protected void onPause() {
        Log.i(ACTIVITY_MAIN,"OnPause executing");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(ACTIVITY_MAIN,"OnResume executing");
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle icicle) {
        Log.i(ACTIVITY_MAIN,"Instance saving");
        super.onSaveInstanceState(icicle);
        icicle.putInt(CONTADORKEY, i);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle icicle) {
        Log.i(ACTIVITY_MAIN,"Instance restored");
        super.onRestoreInstanceState(icicle);
    }

    @Override
    protected void onStop() {
        Log.i(ACTIVITY_MAIN,"Activity Stopped");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i(ACTIVITY_MAIN,"Activity restored");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.i(ACTIVITY_MAIN,"Activity destroyed");
        super.onDestroy();
    }
}