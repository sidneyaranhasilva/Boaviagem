package br.com.acasadocodigo.boaviagem;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by SIDNEY on 18/02/2016.
 */
public class ConfiguracoesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
