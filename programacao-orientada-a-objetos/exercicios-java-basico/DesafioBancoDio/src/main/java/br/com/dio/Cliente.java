package br.com.dio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
   private String nome;
   private String cpf;
   private String telefone;
   private Endereco endereco;
   private TipoCliente tipo;
}