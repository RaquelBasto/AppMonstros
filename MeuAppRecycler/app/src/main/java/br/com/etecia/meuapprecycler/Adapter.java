package br.com.etecia.meuapprecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Personagem> listaPersonagem;

    public Adapter(List<Personagem> lista){
        this.listaPersonagem = lista;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.modelo_personagem, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Personagem personagem = listaPersonagem.get(position);

    holder.nome.setText(personagem.getNome());
    holder.genero.setText(personagem.getGenero());
    holder.idade.setText(personagem.getGenero());
    }

    @Override
    public int getItemCount() {
        return listaPersonagem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nome,genero,idade;
        ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem= itemView.findViewById(R.id.txtImagem);
            nome= itemView.findViewById(R.id.txtNome);
            idade= itemView.findViewById(R.id.txtIdade);
            genero= itemView.findViewById(R.id.txtGenero);

        }
    }
}
