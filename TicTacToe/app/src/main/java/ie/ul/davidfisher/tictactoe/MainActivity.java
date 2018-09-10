package ie.ul.davidfisher.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  private TicTacToeGame mGame;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mGame = new TicTacToeGame(this);
  }

  public void pressedSquare(View view) {
    String tagAsStr = view.getTag().toString();
    int tagAsInt = Integer.parseInt(tagAsStr);
    //Log.d("TTT", "You pressed index " + tagAsInt);

  }

  public void pressedNewGame(View view) {
    
  }


}









