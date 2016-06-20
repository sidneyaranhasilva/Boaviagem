package br.com.acasadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SIDNEY on 04/02/2016.
 */
public class DashboardActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Log.i("Teste", "Estou testando as dashborad ");
    }

    public void selecionarOpcao(View view){
       switch (view.getId()){
           case R.id.nova_viagem:
               startActivity(new Intent(this, ViagemActivity.class));
               break;
           case R.id.novo_gasto:
               startActivity(new Intent(this, GastoActivity.class));
               break;
           case R.id.minhas_viagens:
               startActivity(new Intent(this, ViagemListaActivity.class));
               break;
           case R.id.configuracoes:
               startActivity(
                       new Intent(this, ConfiguracoesActivity.class));
               break;
       }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dashboard_menu, menu);
        return true;
    }


    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        finish();

        return true;
    }
}
