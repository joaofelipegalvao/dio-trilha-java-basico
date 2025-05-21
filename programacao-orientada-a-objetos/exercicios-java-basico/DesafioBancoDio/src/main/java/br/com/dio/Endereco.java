package br.com.dio;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
   private String logradouro;
   private String numero;
   private String complemento;
   private String bairro;
   private String cidade;
   private String uf;
   private String cep;
}