package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
   private Map<LocalDate, Evento> eventosMap;

   public AgendaEventos() {
      this.eventosMap = new HashMap<>();
   }

   public void adicionarEvento(LocalDate data, String nome, String atracao) {
      eventosMap.put(data, new Evento(nome, atracao));
   }

   public void exibirAgenda() {
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
      System.out.println(eventosTreeMap);
   }

   public void obterProximoEvento() {
//      Set<LocalDate> dateSet = eventoMap.keySet();
//      Collection<Evento> values = eventoMap.values();
//      eventoMap.get();
      LocalDate dataAtual = LocalDate.now();
      LocalDate proximaData = null;
      Evento proximoEvento = null;
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
      for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
         if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
            break;
         }
      }
   }

   public static void main(String[] args) {
      AgendaEventos agendaEventos = new AgendaEventos();
      agendaEventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 15), "Evento 1", "Atracao 1");
      agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
      agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
      agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 14), "Evento 4", "Atracao 4");
      agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 15), "Evento 5", "Atracao 5");

      agendaEventos.exibirAgenda();
      agendaEventos.obterProximoEvento();
   }
}
