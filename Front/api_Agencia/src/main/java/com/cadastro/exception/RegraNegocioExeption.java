package com.cadastro.exception;

public class RegraNegocioExeption extends RuntimeException{
 
 private static final long  serrialaVersionUID = 1L;
 
 public RegraNegocioExeption(String mensagem) {
    super(mensagem);
}
}
