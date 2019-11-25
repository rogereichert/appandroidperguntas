package com.roger.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela ;
    private TextView tvSwipe;

    private int pergunta = 1;
    private int contadorCerto = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSwipe = findViewById(R.id.tvSwipe);
        tela = findViewById(R.id.tela);

        tela.setOnTouchListener(new OnSwipeTouchListener(this){

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                perguntas();
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvSwipe.setText("Para cima");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                if (perguntas() == 2){
                    contadorCerto++;
                }

                if (perguntas() == 4){
                    contadorCerto++;
                }

                if (perguntas() == 5){
                    contadorCerto++;
                }

                if (perguntas() == 9){
                    contadorCerto++;
                }

                if (perguntas() == 10){
                    contadorCerto++;
                }



                pergunta++;
                onSwipeBottom();
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                if (perguntas() == 1){
                    contadorCerto++;
                }

                if (perguntas() == 3){
                    contadorCerto++;
                }

                if (perguntas() == 6){
                    contadorCerto++;
                }

                if (perguntas() == 7){
                    contadorCerto++;
                }

                if (perguntas() == 8){
                    contadorCerto++;
                }




                pergunta++;
                onSwipeBottom();
            }

            public int perguntas(){

                switch (pergunta){

                    case 1: tvSwipe.setText("Quanto é 2 + 2? \na) 4 \nb) 8 \n Resposta A deslize para A direita \n Resposta B deslize para a esquerda");
                    break; // direita

                    case 2: tvSwipe.setText("Quanto é 4 + 4? \na) 1 \nb) 8 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break;

                    case 3: tvSwipe.setText("Quanto é 5 * 4? \na) 20 \nb) 10 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break; // direita

                    case 4: tvSwipe.setText("Quanto é 2 + 3? \na) 6 \nb) 5 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break;

                    case 5: tvSwipe.setText("Quanto é 100 / 4? \na) 21 \nb) 25 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break;

                    case 6: tvSwipe.setText("Quanto é 10% de 100? \na) 10 \nb) 90 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break; // direita

                    case 7: tvSwipe.setText("Quanto é 12 + 12? \na) 24 \nb) 18 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break; // direita

                    case 8: tvSwipe.setText("Quanto é 4 * 4? \na) 16 \nb) 58 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break; // direita

                    case 9: tvSwipe.setText("Quanto é 25 * 4? \na) 14 \nb) 100 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break;

                    case 10: tvSwipe.setText("Quanto é 10000 * 1? \na) 20 \nb) 10000 \n Resposta a deslize para A direita \n Resposta B deslize para a esquerda");
                    break;





                    default: tvSwipe.setText("Você acertou: " + contadorCerto);

                }

                return pergunta;
            }

        });


    }

}
