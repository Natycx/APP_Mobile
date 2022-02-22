package com.example.agenda;

import android.app.Application;

import com.example.agenda.DAO.AlunoDAO;
import com.example.agenda.model.Aluno;

@SuppressWarnings("WeakerAccess")
public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunoDeTeste();
    }

    private void criaAlunoDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Alex","122254855", "alex@gmai..com"));
        dao.salva(new Aluno("Fran", "22336589963", "fran@gmail.com"));
    }
}
