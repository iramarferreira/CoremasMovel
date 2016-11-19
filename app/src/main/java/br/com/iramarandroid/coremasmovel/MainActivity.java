package br.com.iramarandroid.coremasmovel;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    private AlertDialog alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepararTabLayout();

    }

    private void prepararTabLayout() {

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Categorias"));
        tabLayout.addTab(tabLayout.newTab().setText("Favoritos"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.cor1)));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    public void onBackPressed() {
        sair();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.contato) {

            mensagemContato();
            return true;

        }
        if (id == R.id.compartilhar) {
            compartilharApp();
            return true;
        }
        if (id == R.id.sobre) {
            mensagemSobre();
            return true;

        }
        if (id == R.id.sair) {
            MainActivity.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void mensagemContato() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define a barra de título
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
        View customTitle = inflater.inflate(R.layout.custom_title, null);
        TextView title = (TextView) customTitle.findViewById(R.id.customtitlebar);
        title.setText(getString(R.string.contato));

        //define a view do alertDialog
        View view = inflater.inflate(R.layout.view_contato, null);
        Button bt_ok = (Button) view.findViewById(R.id.bt_ok);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta.dismiss();

            }
        });

        builder.setCustomTitle(customTitle);
        builder.setView(view);

        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();


    }

    public void mensagemSobre() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define a barra de título
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
        View customTitle = inflater.inflate(R.layout.custom_title, null);
        TextView title = (TextView) customTitle.findViewById(R.id.customtitlebar);
        title.setText(getString(R.string.menu_sobre));

        //define a view do alertDialog
        View view = inflater.inflate(R.layout.view_sobre, null);
        Button bt_ok = (Button) view.findViewById(R.id.bt_ok);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta.dismiss();

            }
        });

        builder.setCustomTitle(customTitle);
        builder.setView(view);

        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }

    public void sair() {
        new AlertDialog.Builder(this)
                .setMessage("Deseja realmente sair?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Não", null)
                .show();
    }

    public void compartilharApp(){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.link_app));
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, getString(R.string.menu_compartilhar)));
    }


}
