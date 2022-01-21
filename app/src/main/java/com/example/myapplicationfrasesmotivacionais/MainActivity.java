package com.example.myapplicationfrasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  mudarFrase(View view){
        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[]frases = {"Não importa o que você decidiu. O que importa é que isso te faz feliz",
                "Quando pensar em desistir, lembre-se porque começou",
                "Se não puder fazer tudo, faça tudo que puder",
                "Comece onde você está. Use o que você tem. Faça o que puder", "Simplesmente " +
                "viva a vida. 💗",
                "Que venham dias melhores", "O corpo alcança o que a mente acredita",
                "Hoje vai dar tudo certo","Dias de luz sempre retornam para quem iluminado está. ✨",
                "Nem tudo na vida são flores, mas, quando for, regue.",
                "Até o maior dos prédios começa no chão", "Não sabendo que era impossível, " +
                "foi lá e fez.", "Eu nasci para ser feliz, não para ser normal.",
                "Ninguém é igual a você, e isso pode ser sua grande arma.",
                "Jamais desista de ser feliz.", "Não chore porque acabou, sorria porque aconteceu.",
                "O melhor lugar do mundo é aqui e agora.",
                "Acredite: tudo tem seu tempo. 💗",
                "Corra, viva, sonhe e alcance.",
                "Seu maior medo também pode ser sua maior motivação.",
                "A força de vontade é meu superpoder.",
                "Tudo é possível. O impossível apenas demora mais",
                "Amanhã será um dia melhor.",
                "Você é forte, você é capaz, você pode.",
                "Até seu último suspiro, viva uma vida de tirar o fôlego. ✨",
                "A vida é curta demais para deixarmos nossos sonhos adormecidos.",
                "Pare de ter medo do que poderia dar errado e pense no que poderia dar certo.",
                "Não importa a cor do céu. Quem faz o dia bonito é você.",
                "O melhor está por vir. Acredite!",
                "Se for pra ser, será. Se tá demorando, é porque o melhor ainda está por vir.",
                "E que nunca nos falte a esperança de dias melhores",
                "Às vezes, uma coisa boa acaba para que outra melhor comece.",
                "Acreditar é ser feliz ainda antes de acontecer.",
                "O segredo é um só: acreditar que tudo vai dar certo, porque vai.",
                "A sua felicidade pode estar no próximo passo.",
                "Pensamento positivo só leva a gente para frente",
                "São os caminhos difíceis que nos levam aos finais felizes",
                "Não tenha medo da mudança. Coisas boas se vão para que melhores possam vir.",
                "Que os dias ruins se tornem raros e os bons virem rotina.",
                "O otimismo é o imã da felicidade.",
                "Seja otimista. Esta é a melhor forma de ver a vida.",
                "Enxergar o lado bom das coisas é uma escolha. ✨",
                "O otimismo é contagioso e começa com você.",
                "Confiar em Deus é ter a certeza de que tudo dará certo.",
                "Deus vai fazer de seu deserto um jardim.",
                "Não coloque limite em seus sonhos. Coloque fé.",
                "Se Deus for sua razão para vencer, você nunca terá porque desistir.",
                "Quem fica de joelhos diante de Deus, fica de pé diante de qualquer coisa.",
                "Olhe pra cima, que é de lá que vem sua força.",
                "Eu sigo a vontade de Deus e confio que assim viverei plena.",
                "Tudo o que Deus faz tem um propósito. 💗"
        };
        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);

    }
}