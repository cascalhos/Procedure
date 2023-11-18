package br.com.procedure.configs;

import br.com.procedure.entities.Procedure;
import br.com.procedure.entities.Session;
import br.com.procedure.repository.ProcedureRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.List;

@ChangeLog
public class MongoConfig {
    @ChangeSet(order = "001", id = "seedDatabaseProcedure", author = "Thamires")
    public void seedDatabase(ProcedureRepository procedureRepository){

        List<Session> sessionsLimpezaPele = List.of(
                new Session("Tradicional", 130.0f),
                new Session("Rejuvenescedora", 160.0f),
                new Session("Booster Colágeno", 160.0f),
                new Session("Clareadora", 190.0f),
                new Session("Antiacne", 200.0f)
        );

        List<Session> sessionsTratamento = List.of(
                new Session("Hidratação", 120.0f),
                new Session("Olheiras", 130.0f),
                new Session("Rejuvenescimento", 140.0f),
                new Session("Manchas", 160.0f),
                new Session("Antiacne", 180.0f)
        );

        List<Session> sessionsMicroagulhamento = List.of(
                new Session("Anti-aging", 300.0f),
                new Session("Cicatrizes", 300.0f),
                new Session("Clareador", 300.0f),
                new Session("Botoskin", 300.0f)
        );

        List<Session> sessionsLipBooster = List.of(
                new Session("Revitalização Labial", 120.0f)
        );

        List<Session> sessionsPeelingsQuimicos = List.of(
                new Session("Peeling Químicos", 160.0f)
        );

        List<Session> sessionsDermaplaning = List.of(
                new Session("Dermaplaning", 180.0f)
        );


        List<Procedure> procedures = List.of(
                new Procedure("Limpeza de Pele", sessionsLimpezaPele),
                new Procedure("Tratamentos", sessionsTratamento),
                new Procedure("Microagulhamento", sessionsMicroagulhamento),
                new Procedure("Lip Booster", sessionsLipBooster),
                new Procedure("Peelings Químicos", sessionsPeelingsQuimicos),
                new Procedure("Dermaplaning", sessionsDermaplaning)
        );
        procedureRepository.insert(procedures.get(0));
        procedureRepository.insert(procedures.get(1));
        procedureRepository.insert(procedures.get(2));
        procedureRepository.insert(procedures.get(3));
        procedureRepository.insert(procedures.get(4));
        procedureRepository.insert(procedures.get(5));
    }
}
