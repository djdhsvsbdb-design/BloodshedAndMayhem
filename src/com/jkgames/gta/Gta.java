//Class Name: Gta.java
//Purpose: Main class for Gta game
//Created by Josh on 2012-08-24

package com.jkgames.gta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Gta extends Activity implements OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        View newGameButton = findViewById(R.id.new_game_button);
        newGameButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.exit_button)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.new_game_button)
        {
            startNewGame();
        }
    }

    private void startNewGame()
    {
        Intent gIntent = new Intent(this, Game.class);
        startActivity(gIntent);
    }
}
