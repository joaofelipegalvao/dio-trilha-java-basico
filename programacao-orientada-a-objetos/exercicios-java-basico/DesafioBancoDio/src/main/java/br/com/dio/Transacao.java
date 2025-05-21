package br.com.dio;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Transacao {
   private final TipoTransacao tipo;
   private final double valor;
   private final LocalDateTime data = LocalDateTime.now();

   public enum TipoTransacao {
      DEPOSITO, SAQUE, TRANSFERENCIA_ENVIADA, TRANSFERENCIA_RECEBIDA
   }
}